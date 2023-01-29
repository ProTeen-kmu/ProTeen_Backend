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
public class InfoRepositoryTest {

    @Autowired
    private H2infoRepository H2infoRepository;

    @Test
    @DisplayName("findAll test")
    void findAll() {
        Info info = new Info();
        info.setCategory("as");
        H2infoRepository.save(info);
        int size = H2infoRepository.findAll().size();
        Assertions.assertThat(1).isEqualTo(size);
    }

    @Test
    @DisplayName("Info ID별 검색")
    void save_findById() {
        Info info = new Info();
        H2infoRepository.save(info);
        Assertions.assertThat(info).isEqualTo(H2infoRepository.findById(info.getId()).orElse(null));
    }

}
