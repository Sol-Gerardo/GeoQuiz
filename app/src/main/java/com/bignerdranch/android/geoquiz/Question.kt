package com.bignerdranch.android.geoquiz

import androidx.annotation.StringRes

// resourceID for the question text
// question text and the question answer (true or false)
data class Question(
    @StringRes val textResId: Int,
    val answer: Boolean,
    var hasBeenAnswered: Boolean = false
    )
