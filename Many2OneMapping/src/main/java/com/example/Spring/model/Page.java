package com.example.Spring.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "PAGE_TABLE")
public class Page implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9201141134428149852L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private int number;
    private String content;
    private String chapter;
    
    @ManyToOne
    @JoinColumn(name = "book_id")
    @JsonBackReference
    private Book book;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getChapter() {
		return chapter;
	}

	public void setChapter(String chapter) {
		this.chapter = chapter;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(book, chapter, content, id, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Page other = (Page) obj;
		return Objects.equals(book, other.book) && Objects.equals(chapter, other.chapter)
				&& Objects.equals(content, other.content) && Objects.equals(id, other.id) && number == other.number;
	}

	@Override
	public String toString() {
		return "Page [id=" + id + ", number=" + number + ", content=" + content + ", chapter=" + chapter + ", book="
				+ book + "]";
	}
    
    
}
