package com.ProTeen.backend.faq.service;

import com.ProTeen.backend.faq.domain.Faq;
import com.ProTeen.backend.faq.domain.Info;
import com.ProTeen.backend.faq.repository.faqRepository;
import com.ProTeen.backend.faq.repository.infoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FaqServiceImpl implements FaqService{
    private final faqRepository faqRepository;
    private final infoRepository infoRepository;


    public Optional<Info> searchByCategory(Long id) {
        return infoRepository.findById(id);
    }

    public List<Faq> serachAll() {
        return faqRepository.findAll();
    }

}
