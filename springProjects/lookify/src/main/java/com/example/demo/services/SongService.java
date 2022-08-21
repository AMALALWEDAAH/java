package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Song;
import com.example.demo.reposetories.SongReposetory;


@Service
public class SongService {
	@Autowired
	private SongReposetory songReposetory;
	
	// returns all the books
			public List<Song> allSongs() {
				return songReposetory.findAllByOrderByIdAsc();
				}
			// creates a book
			public Song createSong(@Valid Song s) {
				return songReposetory.save(s);
				}
			
			// retrieves a book
			public Song findSong(Long id) {
				Optional<Song> optionalLanguage = songReposetory.findById(id);
				if(optionalLanguage.isPresent()) {
					return optionalLanguage.get();
					} else {
						return null;
						}
				}
			
			public Song updateSong(@Valid Song song,Long id) {
				// TODO Auto-generated method stub
				Song song1 = songReposetory.findById(id).get();
				song1.setTitle(song.getTitle());
				song1.setArtist(song.getArtist());
				song1.setRating(song.getRating());
				return songReposetory.saveAndFlush(song1);
			}
			
			public void deleteSong(Long id) {
				// TODO Auto-generated method stub
				songReposetory.deleteById(id);
			}
			
			public List<Song> search(String artist){
				return songReposetory.findByArtistContains(artist);
			}

}
