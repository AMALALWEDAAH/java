package com.example.demo.reposetories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Song;

@Repository
public interface SongReposetory extends CrudRepository<Song, Long> {
	List<Song> findAll();
	List<Song> findAllByOrderByIdAsc();
	Song saveAndFlush(Song Song1);

	List<Song> findByArtistContains(String artist);
}
