package com.mertbaykal.ktortest

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }

    suspend fun getPopularMovies(): String {
        val response: HttpResponse = HttpClient().get("https://api.themoviedb.org/3/movie/popular?api_key=6a3250b8b666ace2104278cd40e42255&language=tr-TR&page=1")
        return response.bodyAsText()
    }
}