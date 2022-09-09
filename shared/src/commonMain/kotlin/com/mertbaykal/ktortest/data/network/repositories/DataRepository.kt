package com.mertbaykal.ktortest.data.network.repositories

import com.mertbaykal.ktortest.base.BaseRepository
import com.mertbaykal.ktortest.data.network.module.NetworkModule
import com.mertbaykal.ktortest.data.network.service.ApiServiceImpl
import io.ktor.client.statement.*
import kotlinx.coroutines.flow.Flow

class DataRepository constructor(
    private val service: ApiServiceImpl = ApiServiceImpl(NetworkModule.getClient())
) : BaseRepository() {

    fun getPopularMovies(): Flow<HttpResponse> {
        return fetch {
            service.getPopularMovies()
        }
    }
}