package dao;

import entities.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO extends ConnectionDAO{

    public void insert(Book book){
        String sql = """
                INSERT INTO book(nome, sinopse, ano, editora)
                VALUES(?, ?, ?, ?);
                """;

        try(Connection connection = connection();
            PreparedStatement stat = connection().prepareStatement(sql)){
            stat.setString(1, book.getTitle());
            stat.setString(2, book.getSynopsis());
            stat.setInt(3, book.getYear());
            stat.setString(4, book.getPublisher());
            stat.execute();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public List<Book> selectAll(){
        List<Book> list = new ArrayList<>();

        String sql = """
                SELECT livros.id_livro, livros.nome, livros.sinopse, livros.ano, livros.editora, livros.id_autor, autor.nome AS autor
                FROM livros
                INNER JOIN autor
                WHERE autor.id_autor = livros.id_autor
                ORDER BY id_livro ASC;
                """;

        try(Connection connection = connection();
            PreparedStatement stat = connection().prepareStatement(sql)){
            ResultSet res = stat.executeQuery();

            while(res.next()){
                Book book = new Book();

                book.setId(res.getInt("id_livro"));
                book.setTitle(res.getString("nome"));
                book.setSynopsis(res.getString("sinopse"));
                book.setYear(res.getInt("ano"));
                book.setPublisher(res.getString("editora"));

                list.add(book);
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }
}
