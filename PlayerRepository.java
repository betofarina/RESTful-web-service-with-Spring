package com.codeoftheweb.salvo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource  /*  the annotation @RepositoryRestResource turns PlayerRepository into a Rest Repository. Spring Boot looks for public getters such as

public String getUserName()

and creates methods to generate JSON for the associated fields. */

public interface PlayerRepository extends JpaRepository<Player, Long> {  /* an interface that extends JpaRepository will have the most commonly needed methods for creating, retrieving, updating, and deleting. */

}