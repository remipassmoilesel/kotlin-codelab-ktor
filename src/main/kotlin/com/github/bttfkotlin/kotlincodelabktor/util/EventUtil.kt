package com.github.bttfkotlin.kotlincodelabktor.util

import com.github.bttfkotlin.kotlincodelabktor.bean.Event

object EventUtil {

    val unitsString = arrayOf(
            "zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine"
    )

    fun prettier(events: List<Event>): List<Event> {
        return events
                .filter { it.date.isNotBlank() }
                .map { it.copy(date = dateToDateString(it.date)) }
    }

    fun dateToDateString(date: String): String = date
            .map { it.toString().toInt() }
            .map { unitsString[it] }.joinToString(" ")

}