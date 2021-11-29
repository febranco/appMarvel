package com.example.marvel.data.network.response

// classe para confirmar a classe do response


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)

 data class marvelResultsResponse (
    @Json(name = "id")
    val id: String,

    @Json(name ="name")
    val name: String,

    @Json(name = "description")
    val description: String,

    @Json(name = "thumbnail")
    val marvelThumbnail: marvelThumbnailResponse

)