package application;

import entities.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Book> list = new ArrayList<Book>();
        int id = 0;

        while (true) {
            System.out.println("--------------------------");
            System.out.println("Bem vindo(a) a biblioteca! ");
            System.out.println();
            System.out.println("[ 1 ] Adicionar livros");
            System.out.println("[ 2 ] Verificar o acervo");
            System.out.println("[ 3 ] Sair");
            int response = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (response) {
                case 1:
                    id = id + 1;
                    System.out.println("--------------------------");
                    System.out.println("Preencha os campos abaixo:");

                    System.out.print("Nome do livro: ");
                    String title = sc.nextLine();

                    System.out.print("Autor: ");
                    String author = sc.nextLine();

                    Book b = new Book(id, title, author);
                    list.add(b);
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("Não há resultados!");
                        System.out.println("------------------");
                    } else {
                        for (Book book : list) {
                            System.out.println(book);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Até breve!");
                    System.out.println("----------");
                    sc.close();
                    return;

                default:
                    System.out.println("Valor inválido!");
                    System.out.println("---------------");
            }

            System.out.println();
        }
    }
}
