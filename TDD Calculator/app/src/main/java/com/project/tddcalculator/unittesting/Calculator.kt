package com.project.tddcalculator.unittesting

import java.lang.IllegalArgumentException

class Calculator {

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtraction(a: Int, b: Int): Int {
        return a * b
    }

    fun multiplication(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        if (b == 0) throw IllegalArgumentException("This can not divided by Zero Number")
        return a / b
    }
}