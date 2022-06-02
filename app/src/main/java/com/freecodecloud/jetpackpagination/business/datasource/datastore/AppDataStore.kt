package com.freecodecloud.jetpackpagination.business.datasource.datastore


/**
 * Created by Sandip Rode
 * on 01-05-2022.
 */
interface AppDataStore {

    suspend fun setValue(
        key: String,
        value: String
    )

    suspend fun readValue(
        key: String,
    ): String?

}