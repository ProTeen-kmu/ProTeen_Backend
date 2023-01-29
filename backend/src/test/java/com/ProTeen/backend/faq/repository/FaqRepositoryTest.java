package com.ProTeen.backend.faq.repository;

import com.ProTeen.backend.faq.domain.Faq;
import com.ProTeen.backend.faq.domain.Info;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@Transactional

@SpringBootTest
public class FaqRepositoryTest {

    @Autowired
    private H2faqRepository H2faqRepository;

    @Test
    @DisplayName("findAll test")
    void findAll() {
        Faq faq = new Faq();
        faq.setCategory("as");

        H2faqRepository.save(faq);
        int size = H2faqRepository.findAll().size();
        Assertions.assertThat(1).isEqualTo(size);
    }

    @Test
    @DisplayName("faq ID별 검색")
    void save_findById() {
        Faq faq = new Faq();
        H2faqRepository.save(faq);
        Assertions.assertThat(faq).isEqualTo(H2faqRepository.findById(faq.getId()).orElse(null));
    }
}
