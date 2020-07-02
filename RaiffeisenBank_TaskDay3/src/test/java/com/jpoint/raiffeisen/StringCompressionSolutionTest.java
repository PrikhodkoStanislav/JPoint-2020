package com.jpoint.raiffeisen;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for StringCompressionSolution class compress method
 */
public class StringCompressionSolutionTest {

    private StringCompression stringCompression;

    @Before
    public void initObjects() {
        stringCompression = new StringCompressionSolution();
    }

    @Test
    public void compressFiveA() {
        Assert.assertEquals("5A", stringCompression.compress("AAAAA"));
    }

    @Test
    public void compressFiveAThreeBOneC() {
        Assert.assertEquals("5A3BC", stringCompression.compress("AAAAABBBC"));
    }

    @Test
    public void compressEmptyString() {
        Assert.assertEquals("", stringCompression.compress(""));
    }

    @Test
    public void compressNull() {
        Assert.assertNull(stringCompression.compress(null));
    }

    @Test
    public void compressABC() {
        Assert.assertEquals("ABC", stringCompression.compress("ABC"));
    }

    @Test
    public void compressOneAFiveBOneC() {
        Assert.assertEquals("A5BC", stringCompression.compress("ABBBBBC"));
    }

    @Test
    public void compressTaskMail() {
        Assert.assertEquals("jpoint2020@rai2feisen.ru", stringCompression.compress("jpoint2020@raiffeisen.ru"));
    }
}