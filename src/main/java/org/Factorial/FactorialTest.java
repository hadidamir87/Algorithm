package org.Factorial;

public class FactorialTest {
    public int factorial(Integer n) {

        if (n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;

    }
}
