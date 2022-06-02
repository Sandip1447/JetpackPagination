package com.freecodecloud.jetpackpagination.business.domain.util


/**
 * Created by Sandip Rode
 * on 01-05-2022.
 */
class Constants {

    companion object{

        const val BASE_URL = "https://open-api.xyz/api/"
        const val PASSWORD_RESET_URL: String = "https://open-api.xyz/password_reset/"

        const val NETWORK_TIMEOUT = 6000L
        const val CACHE_TIMEOUT = 2000L
        const val TESTING_NETWORK_DELAY = 0L // fake network delay for testing
        const val TESTING_CACHE_DELAY = 0L // fake cache delay for testing

        const val PAGINATION_PAGE_SIZE = 10
    }
}