package com.ProTeen.backend.faq.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Faq {
    @Id //private key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //자동 생성
    @Column(name ="faq_id")
    private Long id;

    private String category;

}
