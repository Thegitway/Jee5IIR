package com.example.microservice.repo;

import com.example.microservice.entity.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.awt.print.Pageable;

@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit,Long> {
//    @RestResource(path="/byName")
// Page<Produit> findByNameContains(@Param("kw") String name, Pageable pageable);
}
