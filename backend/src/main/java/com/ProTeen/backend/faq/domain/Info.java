package com.ProTeen.backend.faq.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //자동 생성
    @Column(name="info_Id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY) //EAGER
    @JoinColumn(name = "faq_id")
    private Faq faq;
    private String category;
    private String infoTitle;
    private String infoContent;

}
