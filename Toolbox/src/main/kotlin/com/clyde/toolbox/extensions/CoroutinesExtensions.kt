package com.clyde.toolbox.extensions

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

fun <T> CoroutineScope.collect(flow: Flow<T>, collector: suspend (value: T) -> Unit) {
    launch(Dispatchers.IO) {
        flow.collect { value ->
            collector(value)
        }
    }
}

fun <T> CoroutineScope.collectLatest(flow: Flow<T>, collector: suspend (value: T) -> Unit) {
    launch(Dispatchers.IO) {
        flow.collectLatest { value ->
            collector(value)
        }
    }
}

fun <T> CoroutineScope.collectNotNull(flow: Flow<T>, collector: suspend (value: T) -> Unit) {
    launch(Dispatchers.IO) {
        flow.collectLatest { value ->
            value?.let {
                collector(value)
            }
        }
    }
}
