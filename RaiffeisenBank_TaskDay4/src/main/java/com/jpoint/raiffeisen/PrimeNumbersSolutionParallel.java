package com.jpoint.raiffeisen;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * Prime numbers parallel solution
 */
public class PrimeNumbersSolutionParallel extends PrimeNumbersSolution {

    @Override
    public List<Long> primeNumbers(long n) {
        return LongStream.rangeClosed(2, n)
                .parallel()
                .filter(super::isPrime).boxed()
                .collect(Collectors.toList());
    }
}
