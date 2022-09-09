package com.mertbaykal.ktortest

import com.mertbaykal.ktortest.base.BaseViewModel
import com.mertbaykal.ktortest.domain.GetPopularMoviesUseCase
import io.ktor.client.statement.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

open class CommonViewModel constructor(
    private val getPopularMoviesUseCase: GetPopularMoviesUseCase = GetPopularMoviesUseCase()
): BaseViewModel() {

    private val _popularMovies = MutableStateFlow<String?>("")
    val popularMovies: StateFlow<String?> = _popularMovies



    fun getPopularMovies() {
        baseScope.launch {
            getPopularMoviesUseCase.invoke(Unit)
                .collect{
                _popularMovies.value = it.bodyAsText()
            }

        }
    }
}