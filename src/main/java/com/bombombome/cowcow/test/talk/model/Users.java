package com.bombombome.cowcow.test.talk.model;

import javax.persistence.*;

@Entity(name = "members")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    public String name;

    @Column
    public String email;
}
