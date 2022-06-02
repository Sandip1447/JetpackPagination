package com.freecodecloud.jetpackpagination.business.domain.models


/**
 * Created by Sandip Rode
 * on 01-05-2022.
 */
data class BlogPost(
    val pk: Int,
    val title: String,
    val slug: String,
    val body: String,
    val image: String,
    val dateUpdated: Long,
    val username: String
)