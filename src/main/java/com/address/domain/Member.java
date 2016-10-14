package com.address.domain;

import javax.persistence.*;

/**
 * Created by 1004w455 on 2016. 10. 14..
 */
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private long id;

    @Column(nullable = false, length = 256)
    private String password;

    @Column(nullable = false, length = 128)
    private String email;

    @Column(nullable = false, length = 128)
    private String name;

}
