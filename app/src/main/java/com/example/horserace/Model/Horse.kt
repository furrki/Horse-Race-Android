package com.example.horserace.Model

class Horse(private var performance: Int) {

    fun getBenefit(totalPerformance: Int): Double {
        return totalPerformance.toDouble() / performance.toDouble()
    }
}