package com.mertbaykal.ktortest.base

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

internal actual val BaseDispatcher: CoroutineDispatcher = Dispatchers.Main