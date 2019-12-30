package com.stanfit.common

expect fun platform(): String

fun createPlatformName(): String = "Kotlin/Native for ${platform()}"