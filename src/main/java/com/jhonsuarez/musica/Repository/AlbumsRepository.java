package com.jhonsuarez.musica.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonsuarez.musica.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
