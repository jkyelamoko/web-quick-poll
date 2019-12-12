package com.devhome.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "options")
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "option_id")
    private Long id;

    @Column(name = "option_value")
    private String value;
}
