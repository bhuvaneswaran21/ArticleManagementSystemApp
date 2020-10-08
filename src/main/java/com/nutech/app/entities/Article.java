/**
 * 
 */
package com.nutech.app.entities;

import java.util.Date;
import javax.persistence.Entity;


/**
 * @author nutechnology-labs
 *
 */
@Entity
public class Article {
	
	//TODO - object/relational mapping
	private Integer id;
	
	private String slug;
	
	private String title;
	
	private String description;
	
	private String body;
	
	private Date createdAt;
	
	private Date updatedAt;
	
	
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
