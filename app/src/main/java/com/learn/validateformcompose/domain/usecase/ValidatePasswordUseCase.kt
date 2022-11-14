package com.learn.validateformcompose.domain.usecase

class ValidatePasswordUseCase {

    fun execute(password: String): ValidationResult {
        if (password.length < 8) {
            return ValidationResult(
                successful = false,
                errorMessage = "The password at least 8 characters"
            )
        }
        val containsLetterAndDigits = password.any { it.isDigit() } && password.any { it.isLetter() }
        if (!containsLetterAndDigits) {
            return ValidationResult(
                successful = false,
                errorMessage = "The password need to contain at least letter and digit"
            )
        }
        return ValidationResult(
            successful = true
        )
    }

}