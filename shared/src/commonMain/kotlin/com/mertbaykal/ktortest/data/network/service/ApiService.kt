package com.mertbaykal.ktortest.data.network.service

import io.ktor.client.*
import io.ktor.client.statement.*

interface ApiService  {

    suspend fun getPopularMovies(): HttpResponse
}