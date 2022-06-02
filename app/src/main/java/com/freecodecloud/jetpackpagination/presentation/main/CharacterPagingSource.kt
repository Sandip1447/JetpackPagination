package com.freecodecloud.jetpackpagination.presentation.main

import android.net.Uri
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.freecodecloud.jetpackpagination.data.model.CharacterData
import com.freecodecloud.jetpackpagination.data.remote.RetroService


/**
 * Created by Sandip Rode
 * on 01-05-2022.
 */
class CharacterPagingSource(
    val retroService: RetroService
) : PagingSource<Int, CharacterData>() {
    override fun getRefreshKey(state: PagingState<Int, CharacterData>): Int? {
        return state.anchorPosition
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, CharacterData> {
        return try {
            val nextPage: Int = params.key ?: PAGE_INDEX
            val response = retroService.getDataFromAPI(nextPage)
            var nextPageNumber: Int? = null
            if (response.info.next != null) {
                val uri = Uri.parse(response.info.next)
                val nextPageQuery = uri.getQueryParameter("page")
                nextPageNumber = nextPageQuery?.toInt()
            }

            LoadResult.Page(
                data = response.results,
                prevKey = null,
                nextKey = nextPageNumber
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    companion object {

        const val PAGE_INDEX: Int = 1
    }
}