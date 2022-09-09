package com.mertbaykal.ktortest.base

import kotlinx.coroutines.CoroutineDispatcher
import kotlin.native.concurrent.SharedImmutable

@SharedImmutable
internal expect val BaseDispatcher: CoroutineDispatcher