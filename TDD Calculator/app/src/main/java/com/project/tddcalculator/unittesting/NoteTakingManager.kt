package com.project.tddcalculator.unittesting

class NoteTakingManager(
    var noteTakingService: NoteTakingService
) {


    fun getAllBusinessNotes(): List<String> {
        val filter = ArrayList<String>()
        val allNotes = noteTakingService.getAllBusinessNotes()

        for (note in allNotes){
            if (note.contains("Android")){
                filter.add(note)
            }
        }

        return filter
    }
}