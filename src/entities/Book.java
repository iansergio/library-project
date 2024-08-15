package entities;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String name;
    private String synopsis;
    private int year;
    private String publisher;

    // Construtores
    public Book(){}

    public Book(int id, String name, String synopsis, int year, String publisher) {
        this.id = id;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
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
                "%s%n" +
                "Data de publicação: %s %n" +
                "Editora: %s%n", name, synopsis, year, publisher);
    }

    // Função para remover um livro do acervo
    public String removeBook(List <Book> list, int code){
        list.removeIf(book -> book.getId() == code);
        return "O livro \"" + name + "\" foi removido com sucesso!";

    }
}