package com.jpoint.raiffeisen;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * Prime numbers parallel solution
 */
public class PrimeNumbersSolutionParallel implements PrimeNumbers {

    public List<Long> primeNumbers(long n) {
        return LongStream.rangeClosed(2, n)
                .parallel()
                .filter(this::isPrime).boxed()
                .collect(Collectors.toList());
    }

    private boolean isPrime(long number) {
        return LongStream.rangeClosed(2, (long) Math.sqrt(number))
                .allMatch(n -> number % n != 0);
    }
}
