package com.inc.eva.manchkin

data class Player(
    val name: String,
    val level: Int = 0,
    val shoes: Int = 0,
    val head: Int = 0,
    val hand: List<Int> = listOf(),
    val armor: Int = 0,
    val helper: Int = 0,
    val horse: Int = 0,
    val buff: Int = 0,
    val debuff: Int = 0,
)