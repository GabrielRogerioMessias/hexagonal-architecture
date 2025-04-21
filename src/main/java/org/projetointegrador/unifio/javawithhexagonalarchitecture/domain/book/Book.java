package org.projetointegrador.unifio.javawithhexagonalarchitecture.domain.book;

public class Book {
    private Long id;
    private String title;
    private String author;
    private Integer year;
    private String gender;

    public Book() {
    }

    public Book(Long id, String title, String author, Integer year, String gender) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
