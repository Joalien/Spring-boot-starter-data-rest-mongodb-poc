package com.example.poc.dao;

import com.example.poc.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "player", path = "players")
public interface PlayerDao extends MongoRepository<Player, String> {

    List<Player> findByLastName(@Param("name") String name);

}