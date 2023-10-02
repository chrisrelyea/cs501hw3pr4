package com.bignerdranch.android.geoquiz

import androidx.lifecycle.SavedStateHandle
import org.junit.Assert.assertEquals
import org.junit.Test

class QuizViewModelTest {
    @Test
    fun isCheaterInitializedToFalse() {
        val savedStateHandle = SavedStateHandle()
        val quizViewModel = QuizViewModel(savedStateHandle)
        assertEquals(quizViewModel.isCheater, false)

    }
    @Test
    fun isCheaterResetsOnNextQuestion() {
        val savedStateHandle = SavedStateHandle()
        val quizViewModel = QuizViewModel(savedStateHandle)
        quizViewModel.isCheater = true
        quizViewModel.moveToNext()
        assertEquals(quizViewModel.isCheater, false)
    }
}
