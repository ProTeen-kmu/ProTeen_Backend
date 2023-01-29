package com.ProTeen.backend.faq.repository;

import com.ProTeen.backend.faq.domain.Faq;

import java.util.List;
import java.util.Optional;

public interface faqRepository {
    Faq save(Faq faq);
    Optional<Faq> findById(Long id);
    List<Faq> findAll();

}
