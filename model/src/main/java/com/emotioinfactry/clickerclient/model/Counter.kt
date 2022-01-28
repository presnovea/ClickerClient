package com.emotioinfactry.clickerclient.model

/**
 * Define counter object
 */
data class Counter(
    val caption: String,
    val currentValue: Long,
    val canDecrement: Boolean,
    val canBeNegative: Boolean
)