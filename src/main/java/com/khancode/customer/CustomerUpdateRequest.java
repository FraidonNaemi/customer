package com.khancode.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
