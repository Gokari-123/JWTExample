package com.jwt.example.Models;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String userId;
    private String name;
    private String email;
}
