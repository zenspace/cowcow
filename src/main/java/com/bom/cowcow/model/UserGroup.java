package com.bom.cowcow.model;


import javax.persistence.*;
import java.util.Date;

@Entity(name = "userGroup")
@Table(name = "user_group")
public class UserGroup {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column
    private int group;

    @Column
    private String comment;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
}
