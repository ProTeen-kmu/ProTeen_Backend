package com.ProTeen.backend.faq.repository;

import com.ProTeen.backend.faq.domain.Faq;
import com.ProTeen.backend.faq.domain.Info;

import java.util.List;
import java.util.Optional;

public interface infoRepository {
    Info save(Info info);
    Optional<Info> findById(Long id);
    List<Info> findAll();
}
