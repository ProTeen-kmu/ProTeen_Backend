package com.ProTeen.backend.faq.repository;

import com.ProTeen.backend.faq.domain.Faq;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class H2faqRepository implements faqRepository {

    //저장된 키로 찾을때 (하나의 정보만 추출)
    private final EntityManager em;

    @Override
    public Optional<Faq> findById(Long id){
        Faq faq = em.find(Faq.class,id);
        return Optional.ofNullable(faq);
    }

    @Override
    public List<Faq> findAll() {return em.createQuery("select m from Faq m",Faq.class).getResultList();}

    @Override
    public Faq save(Faq faq) {
        if (faq.getId() == null) {
            em.persist(faq);
        } else {
            em.merge(faq);
        }
        return faq;
    }
}
