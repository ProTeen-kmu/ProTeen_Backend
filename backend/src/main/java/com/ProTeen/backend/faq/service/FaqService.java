package com.ProTeen.backend.faq.service;

import com.ProTeen.backend.faq.domain.Faq;
import com.ProTeen.backend.faq.domain.Info;

import java.util.List;
import java.util.Optional;

public interface FaqService {

        public Optional<Info> searchByCategory(Long categoryId);
        public List<Faq> serachAll();

}