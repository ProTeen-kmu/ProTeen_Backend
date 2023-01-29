package com.ProTeen.backend.faq.repository;
import com.ProTeen.backend.faq.domain.Info;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class H2infoRepository implements infoRepository{

    private final EntityManager em; //jpa

    @Override
    public Optional<Info> findById(Long id){
        Info info = em.find(Info.class,id);
        return Optional.ofNullable(info);
    }

    @Override
    public List<Info> findAll() {return em.createQuery("select m from Info m",Info.class).getResultList();}

    @Override
    public Info save(Info info) {
        if (info.getId() == null) {
            em.persist(info);
        } else {
            em.merge(info);
        }
        return info;
    }
}
