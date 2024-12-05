package com.clyde.toolbox

import com.clyde.toolbox.extensions.isFalse
import com.clyde.toolbox.extensions.isTrue
import org.junit.Test
import kotlin.test.assertEquals

class BaseExtensionsTest {
    @Test
    fun `GIVEN true WHEN isTrue THEN true`() {
        // GIVEN
        val value = true

        // WHEN
        val actual = value.isTrue

        // THEN
        val expected = true
        assertEquals(expected, actual)
    }

    @Test
    fun `GIVEN false WHEN isTrue THEN false`() {
        // GIVEN
        val value = false

        // WHEN
        val actual = value.isTrue

        // THEN
        val expected = false
        assertEquals(expected, actual)
    }

    @Test
    fun `GIVEN null WHEN isTrue THEN false`() {
        // GIVEN
        val value: Boolean? = null

        // WHEN
        val actual = value.isTrue

        // THEN
        val expected = false
        assertEquals(expected, actual)
    }

    @Test
    fun `GIVEN true WHEN isFalse THEN false`() {
        // GIVEN
        val value = true

        // WHEN
        val actual = value.isFalse

        // THEN
        val expected = false
        assertEquals(expected, actual)
    }

    @Test
    fun `GIVEN false WHEN isFalse THEN true`() {
        // GIVEN
        val value = false

        // WHEN
        val actual = value.isFalse

        // THEN
        val expected = true
        assertEquals(expected, actual)
    }

    @Test
    fun `GIVEN null WHEN isFalse THEN false`() {
        // GIVEN
        val value: Boolean? = null

        // WHEN
        val actual = value.isFalse

        // THEN
        val expected = false
        assertEquals(expected, actual)
    }
}
