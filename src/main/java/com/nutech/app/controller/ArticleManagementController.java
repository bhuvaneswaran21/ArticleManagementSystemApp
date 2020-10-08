/**
 * 
 */
package com.nutech.app.controller;

import org.springframework.http.ResponseEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nutech.app.entities.Article;
import com.nutech.app.exception.ResourceNotFoundException;
import com.nutech.app.service.ArticleManagementService;

/**
 * @author nuTechnology-labs
 *
 */
@RestController
@RequestMapping(value = "/api/v1")
public class ArticleManagementController {

	@Autowired
	private ArticleManagementService articleManagementService;

	// Story 1: create an article
	@PostMapping(value = "/create")
	public Article createArticle(@RequestBody Article article) {

		// TODO ..

		return null;
	}

	// Story 2: Update an article
	@PutMapping(value = "/update/{slug}")
	public Article updateArticle(@RequestBody Article article, @PathVariable("slug") String slug)
			throws ResourceNotFoundException {

		// TODO ..

		return null;
	}

	// Story 3: Get an article by slug id
	@GetMapping(value = "/article/{slug}")
	public ResponseEntity<Article> getArticleById(@PathVariable("slug") String slug) throws ResourceNotFoundException {

		// TODO ..

		return null;
	}

	// Story 4: Delete an article by slug Id
	@DeleteMapping(value = "/delete/{slugId}")
	public void deleteArticle(@PathVariable("slugId") String slug) throws ResourceNotFoundException {

		// TODO..
	}

	// Story 5: Find time to read for an article using its slug

	// TODO ..

}
