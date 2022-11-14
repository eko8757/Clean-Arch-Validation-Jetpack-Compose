package com.learn.validateformcompose.domain.usecase

class ValidateRepeatPasswordUseCase {

    fun execute(password: String, repeatPassword: String): ValidationResult {
        if (password != repeatPassword) {
            return ValidationResult(
                successful = false,
                errorMessage = "The password not match"
            )
        }
        return ValidationResult(
            successful = true
        )
    }

}