package com.sm.mvc.domain;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private int age;
    private Address address;

}
