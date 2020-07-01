package com.jpoint.raiffeisen;

import org.junit.Assert;
import org.junit.Test;

import static com.jpoint.raiffeisen.StringCompression.stringCompression;

/**
 * Tests for StringCompression class public methods
 */
public class StringCompressionTest {

    @Test
    public void testStringCompressionFiveA() {
        Assert.assertEquals("5A", stringCompression("AAAAA"));
    }

    @Test
    public void testStringCompressionFiveAThreeBOneC() {
        Assert.assertEquals("5A3BC", stringCompression("AAAAABBBC"));
    }

    @Test
    public void testStringCompressionEmptyString() {
        Assert.assertEquals("", stringCompression(""));
    }

    @Test
    public void testStringCompressionNull() {
        Assert.assertEquals(null, stringCompression(null));
    }

    @Test
    public void testStringCompressionABC() {
        Assert.assertEquals("ABC", stringCompression("ABC"));
    }

    @Test
    public void testStringCompressionOneAFiveBOneC() {
        Assert.assertEquals("A5BC", stringCompression("ABBBBBC"));
    }

    @Test
    public void testStringCompressionTaskMail() {
        Assert.assertEquals("jpoint2020@rai2feisen.ru", stringCompression("jpoint2020@raiffeisen.ru"));
    }
}