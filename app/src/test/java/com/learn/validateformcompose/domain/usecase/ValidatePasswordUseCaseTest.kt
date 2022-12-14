package com.learn.validateformcompose.domain.usecase

import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class ValidatePasswordUseCaseTest {

    private lateinit var validatePassword: ValidatePasswordUseCase

    @Before
    fun setUp() {
        validatePassword = ValidatePasswordUseCase()
    }

    @Test
    fun `Password is letter-only, returns error`() {
        val result = validatePassword.execute("abchdnsj")

        assertEquals(result.successful, false)
    }
}