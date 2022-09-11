package com.mertbaykal.ktortest

import com.mertbaykal.ktortest.base.BaseViewModel
import com.mertbaykal.ktortest.data.model.MovieResult
import com.mertbaykal.ktortest.domain.GetPopularMoviesUseCase
import io.ktor.client.statement.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

open class CommonViewModel constructor(
    private val getPopularMoviesUseCase: GetPopularMoviesUseCase = GetPopularMoviesUseCase()
) : BaseViewModel() {

    private val _popularMovies = MutableStateFlow<MovieResult?>(null)
    val popularMovies: StateFlow<MovieResult?> = _popularMovies

    init {
        getPopularMovies()
    }

    private fun getPopularMovies() {
        baseScope.launch {
            getPopularMoviesUseCase.invoke(Unit)
                .collect {
                    _popularMovies.value = it
                }
        }
    }
}