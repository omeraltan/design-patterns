package com.principles.keepitsimplestupid;

/**
 *      Keep it simple, stupid
 */

// Bad Example
public class MathUtils {

    public static int add(int a, int b) {
        int result = a;
        for (int i = 0; i < b; i++) {
            result++;
        }
        return result;
    }

}

// Good Example
class MathUtil2 {

    public static int add(int a, int b) {
        return a + b;
    }

}


