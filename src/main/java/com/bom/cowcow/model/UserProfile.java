package com.bom.cowcow.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_profile")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userID;

    @Column
    private String username;

    @Column
    private String email;

    @Column
    private Date createdAt;

    @Column
    private Date updatedAt;
}
