package com.jpoint.raiffeisen;

import org.junit.Before;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

/**
 * Tests for PrimeNumbers class primeNumbers method
 */
public class PrimeNumbersTest {

    private PrimeNumbers primeNumbers;
    private PrimeNumbers primeNumbersParallel;


    @Before
    public void initObjects() {
        primeNumbers = new PrimeNumbersSolution();
        primeNumbersParallel = new PrimeNumbersSolutionParallel();
    }

    // Sequential solution till one million: PT1.5739738S
    @Test
    public void primeNumberTillOneMillion() {
        Instant start = Instant.now();
        System.out.println(primeNumbers.primeNumbers(1000000));
        Instant end = Instant.now();
        System.out.println("Sequential solution till one million: " + Duration.between(start, end));
    }

    // Parallel solution till one million: PT0.3795626S
    @Test
    public void primeNumberParallelTillOneMillion() {
        Instant start = Instant.now();
        System.out.println(primeNumbersParallel.primeNumbers(1000000));
        Instant end = Instant.now();
        System.out.println("Parallel solution till one million: " + Duration.between(start, end));
    }
}