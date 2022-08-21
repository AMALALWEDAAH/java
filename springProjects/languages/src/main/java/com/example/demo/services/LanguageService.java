package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Language;
import com.example.demo.reposetories.LanguageRepository;



@Service
public class LanguageService {
	@Autowired
	private LanguageRepository langugeRepositoty;
	
	// returns all the books
		public List<Language> allLanguages() {
			return langugeRepositoty.findAll();
			}
		// creates a book
		public Language createLanguage(@Valid Language l) {
			return langugeRepositoty.save(l);
			}
		
		// retrieves a book
		public Language findLanguage(Long id) {
			Optional<Language> optionalLanguage = langugeRepositoty.findById(id);
			if(optionalLanguage.isPresent()) {
				return optionalLanguage.get();
				} else {
					return null;
					}
			}
		
		public Language updateLanguage(@Valid Language Language,Long id) {
			// TODO Auto-generated method stub
			Language Language1 = langugeRepositoty.findById(id).get();
			Language1.setName(Language.getName());
			Language1.setCreator(Language.getCreator());
			Language1.setVersion(Language.getVersion());
			return langugeRepositoty.saveAndFlush(Language1);
		}
		
		public void deleteLanguage(Long id) {
			// TODO Auto-generated method stub
			langugeRepositoty.deleteById(id);
		}

}
