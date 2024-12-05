package com.clyde.toolbox.extensions

val Boolean?.isTrue get() = this == true
val Boolean?.isFalse get() = this == false
val Any?.isNull get() = this == null
