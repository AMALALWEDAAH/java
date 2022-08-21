package com.example.demo.reposetories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Language;
@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {
	List<Language> findAll();

	Language saveAndFlush(Language language1);

}
