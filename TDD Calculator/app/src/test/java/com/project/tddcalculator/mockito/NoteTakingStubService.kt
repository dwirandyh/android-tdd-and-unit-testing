package com.project.tddcalculator.mockito

import com.project.tddcalculator.unittesting.NoteTakingService

class NoteTakingStubService : NoteTakingService {

    override fun getAllBusinessNotes(): List<String> {
        return arrayListOf("Android market is huge", "Android is awesome", "My name is randy")
    }
}