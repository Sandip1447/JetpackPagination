package com.freecodecloud.jetpackpagination.presentation.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.freecodecloud.jetpackpagination.data.model.CharacterData
import com.freecodecloud.jetpackpagination.data.remote.RetroInstance
import com.freecodecloud.jetpackpagination.data.remote.RetroService
import kotlinx.coroutines.flow.Flow


/**
 * Created by Sandip Rode
 * on 01-05-2022.
 */
class CharacterViewModel : ViewModel() {

    lateinit var retroService: RetroService

    init {
        retroService = RetroInstance.getRetroInstance().create(RetroService::class.java)
    }

    fun getListData(): Flow<PagingData<CharacterData>> {
        return Pager(config = PagingConfig(pageSize = 20, maxSize = 200),
            pagingSourceFactory = { CharacterPagingSource(retroService) }).flow.cachedIn(
            viewModelScope
        )
    }
}
