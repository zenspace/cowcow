package com.bom.cowcow.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "members")
@Getter
@Setter
public class Member {
    public void Member() { }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto created ID
    private Long id;

    @Column(length=80, nullable=false) // varchar(100) not null
    private String email;

    @Column(length=20, nullable=false) // varchar(100) not null
    private String password;

    @Column(length=20, nullable=false) // varchar(100) not null
    private String username;

    @Column
    private Date createdAt;

    @Column
    private Date updatedAt;
}
