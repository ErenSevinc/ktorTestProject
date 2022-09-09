package com.mertbaykal.ktortest.data.network.service

import com.mertbaykal.ktortest.data.network.module.NetworkModule
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*

class ApiServiceImpl constructor(
    private val client: HttpClient
): ApiService {

    override suspend fun getPopularMovies(): HttpResponse {
        return client.get(NetworkModule.BASE_URL) {
            url {
                path("movie/popular")
                parameter(key = "api_key", value = NetworkModule.API_KEY)
                parameter(key = "language", value = "tr-TR")
                parameter(key = "page", value = 1)
            }
        }
    }


}