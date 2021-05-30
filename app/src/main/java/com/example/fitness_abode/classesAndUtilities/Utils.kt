package com.example.fitness_abode.classesAndUtilities

import android.text.TextUtils
import android.util.Patterns

public fun sms() {

}

public fun email() {

}

public fun isValidEmail(target: CharSequence?): Boolean {
    return !TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches()
}



