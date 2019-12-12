package com.devhome.domain;


import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "vote")
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vote_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "option_id")
    private Option option;

}
