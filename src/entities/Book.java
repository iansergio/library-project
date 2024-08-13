package entities;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private String synopsis;
    private String author;
    private int year;
    private String publisher;

    // Construtores
    public Book(){}

    public Book(int id, String title, String synopsis, String author, int year, String publisher) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.synopsis = synopsis;
        this.year = year;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Método toString
    public String toString() {
        return "[ " + id + " ]" + String.format(" Título: %s%n" +
                "Autor(a): %s%n" +
                "%s%n" +
                "Data de publicação: %s %n" +
                "Editora: %s%n", title, author, synopsis, year, publisher );
    }

    // Função para remover um livro do acervo
    public String removeBook(List <Book> list, int code){
        list.removeIf(book -> book.getId() == code);
        return "O livro \"" + title + "\" foi removido com sucesso!";

    }
}