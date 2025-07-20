package com.example.demo.user.authentication;

/**
 * Enum representing different user roles in the system.
 * Each role has specific permissions and access levels.
 */
public enum Role {

    /** Regular user with standard permissions. */
    ROLE_USER,

    /** Employee role with elevated permissions compared to USER. */
    ROLE_EMPLOYEE,

    /** Administrator role with full system access. */
    ROLE_ADMIN
}
