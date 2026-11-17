package com.maram.Makeuppp.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.maram.Makeuppp.entities.Type;
import com.maram.Makeuppp.entities.makeuppp;

@RepositoryRestResource(path = "makeups")
@CrossOrigin(origins = "http://localhost:4200")
public interface MakeupppRepository extends JpaRepository<makeuppp, Long> {

    @Query("select p from makeuppp p where p.nomMakeup like concat('%', :nom, '%') and p.prix > :prix")
    List<makeuppp> findByNomMakeupAndPrix(
            @Param("nom") String nom,
            @Param("prix") Double prix);

    @Query("select p from makeuppp p where p.type = ?1")
    List<makeuppp> findByType(Type type);

    List<makeuppp> findByType_IdType(Long idType);

    List<makeuppp> findByOrderByNomMakeupAsc();

    @Query("select p from makeuppp p order by p.nomMakeup ASC, p.prix DESC")
    List<makeuppp> trierProduitsNomsPrix();

    @Query("select m from makeuppp m where m.nomMakeup like %?1%")
    List<makeuppp> findByNomMakeup(String nom);
}
