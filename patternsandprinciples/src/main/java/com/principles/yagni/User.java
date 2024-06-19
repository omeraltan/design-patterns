package com.principles.yagni;

/**
 *      You Ain't Going to Need It - YAGNI
 */

// Bad Example
public class User {
    private String name;
    private String email;
    private String phoneNumber; // Now it is not used, but maybe it will be used later.

    // Getter ve setter methods
}

// Good Example
class User2{

    private String name;
    private String email;

    // Getter ve setter methods
}
