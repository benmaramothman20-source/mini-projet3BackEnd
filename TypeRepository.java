
package com.maram.Makeuppp.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.maram.Makeuppp.entities.Type;

@RepositoryRestResource(path = "types")
@CrossOrigin(origins = "http://localhost:4200")
public interface TypeRepository extends JpaRepository<Type, Long> {

}
