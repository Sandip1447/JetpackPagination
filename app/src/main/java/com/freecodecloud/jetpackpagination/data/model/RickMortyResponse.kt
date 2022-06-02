package com.freecodecloud.jetpackpagination.data.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RickMortyResponse(
    @SerializedName("info")
    @Expose
    var info: Info,
    @SerializedName("results")
    @Expose
    var results: List<CharacterData>
)

data class CharacterData(
    @SerializedName("name")
    @Expose
    var name: String?,
    @SerializedName("species")
    @Expose
    var species: String?,
    @SerializedName("image")
    @Expose
    var image: String?,
)

data class Info(
    @SerializedName("count")
    @Expose
    var count: Int?,
    @SerializedName("pages")
    @Expose
    var pages: String?,
    @SerializedName("next")
    @Expose
    var next: String?,
    @SerializedName("prev")
    @Expose
    var prev: String?
)