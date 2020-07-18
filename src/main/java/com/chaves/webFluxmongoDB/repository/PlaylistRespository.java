package com.chaves.webFluxmongoDB.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.chaves.webFluxmongoDB.document.Playlist;

public interface PlaylistRespository extends ReactiveMongoRepository<Playlist, String>{

}
