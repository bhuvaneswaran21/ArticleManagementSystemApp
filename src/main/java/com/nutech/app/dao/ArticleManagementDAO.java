package com.nutech.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nutech.app.entities.Article;

/**
 * 
 * @author nutechnology-labs
 *
 */
@Repository
public interface ArticleManagementDAO  extends CrudRepository<Article, String> {
	
	// TODO ..

}
