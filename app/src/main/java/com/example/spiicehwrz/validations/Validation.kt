package com.example.spiicehwrz.validations

import com.example.spiicehwrz.R

private val regexTitle = Regex("""~!@#\$%^&*+-\s\d""")
private val regexEmail = Regex("""^\\w{6,}@\\w+\\.\\p{2,4}""")



fun titleValidation(title: String): ValidationResult {
    return when {
        title.contains(regexTitle) -> ValidationResult.Invalid(R.string.title_inv_symbol)
        title.length >= 5 -> ValidationResult.Invalid(R.string.title_invalid)
        else -> ValidationResult.Valid
    }
}

fun emailValidation(email : String) : ValidationResult{
    return when{
        email.length >= 8 -> ValidationResult.Invalid(R.string.email_light)
        email.contains(regexEmail) -> ValidationResult.Invalid(R.string.email_uncorrect)
        else -> ValidationResult.Valid
    }
}