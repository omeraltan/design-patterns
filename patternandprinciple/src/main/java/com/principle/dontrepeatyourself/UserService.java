package com.principle.dontrepeatyourself;

/**
 *      Don't Repeat Yourself - DRY
 */

// Bad Example
public class UserService {

    public void saveUser(String name, String email) {
        if (name == null || email == null) {
            throw new IllegalArgumentException("Name or email cannot be null");
        }
        // User save code
    }

    public void updateUser(String name, String email) {
        if (name == null || email == null) {
            throw new IllegalArgumentException("Name or email cannot be null");
        }
        // User update code
    }

}

// Good Example
class UserService2 {

    private void validate(String name, String email) {
        if (name == null || email == null) {
            throw new IllegalArgumentException("Name or email cannot be null");
        }
    }

    public void saveUser(String name, String email) {
        validate(name, email);
        // User save code
    }

    public void updateUser(String name, String email) {
        validate(name, email);
        // User update code
    }

}
