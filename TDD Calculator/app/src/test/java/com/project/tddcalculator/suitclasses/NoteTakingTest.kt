package com.project.tddcalculator.suitclasses

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Suite


/**
 * Suite Feature is used to combine multiple class and test case into one file
 */
@RunWith(Suite::class)
@Suite.SuiteClasses(
    *[
        NoteTakingTest.AddNoteTest::class,
        NoteTakingTest.AddImageNote::class
    ]
)
class NoteTakingTest {


    class AddNoteTest {

        @Test
        fun testEmptyNote() {

        }

        @Test
        fun testMultilineText() {

        }
    }

    class AddImageNote {

        @Test
        fun testGifImage() {

        }

        @Test
        fun testVeryLargeImage() {

        }
    }
}