package com.nutech.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutech.app.dao.ArticleManagementDAO;
import com.nutech.app.entities.Article;

/**
 * @author nuTechnology-labs
 *
 */
@Service
public class ArticleManagementService {
	
	@Autowired
    ArticleManagementDAO articleManagementDao;
	
	public Article createArticle(Article article) {
		
		// TODO -- persist article
        return null;		
	}

	public Optional<Article> getArticleBySlug(String slug) {
		
		// TODO -- get article
		return null;
	}

	public void deleteArticle(Article article) {
		
		// TODO -- delete article
	}

}
