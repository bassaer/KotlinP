package main

import org.apache.commons.lang.RandomStringUtils

/**
 * Main Runner
 * Created by nakayama on 2018/01/13.
 */

fun main(args: Array<String>) {
    val array = ArrayList<String>()
    initArray(array, 10000)

    val result = ArrayList<String>()

    var startTime = System.currentTimeMillis()
    array.forEach {
        (it[0].toLowerCase() + it.substring(1)).let {
            result.add(it)
        }
    }
    var endTime = System.currentTimeMillis()

    println("plus result -> " + (endTime - startTime) + "[ms]")

    result.clear()
    val stringBuilder = StringBuilder()

    startTime = System.currentTimeMillis()
    array.forEach {
        stringBuilder.setLength(0)
        stringBuilder.append(it[0].toLowerCase())
        stringBuilder.append(it.substring(1))
        result.add(stringBuilder.toString())
    }

    endTime = System.currentTimeMillis()

    println("SB result -> " + (endTime - startTime) + "[ms]")

}

fun initArray(array: ArrayList<String>, size: Int) {
    array.clear()

    for (i in 0..size) {
        array.add(RandomStringUtils.randomAlphabetic(10).toUpperCase())
    }
}

fun showResult(array: ArrayList<String>) {
    array.forEach {
        println(it)
    }
    println()
}



