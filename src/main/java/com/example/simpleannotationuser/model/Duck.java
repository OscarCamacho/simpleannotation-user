package com.example.simpleannotationuser.model;

import com.example.simpleannotation.annotations.Builder;

@Builder
public final class Duck {
    private String name;
    private String color;
    private Boolean canFly;
    private Integer numberOfDucklings;
}
