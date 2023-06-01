package com.example.spiicehwrz.validations

sealed class ValidationResult {

    object Valid : ValidationResult()
    class Invalid(val errorId: Int) : ValidationResult()
}