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
        Book b = new Book();
        int id = 0;

        // Loop "infinito" para realizar as atividades
        while (true) {
            System.out.println("--------------------------");
            System.out.println("Bem vindo(a) a biblioteca!");
            System.out.println();
            System.out.println("[ 1 ] Adicionar livro");
            System.out.println("[ 2 ] Verificar o acervo");
            System.out.println("[ 3 ] Remover livro");
            System.out.println("[ 4 ] Sair ");
            int response = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (response) {
                case 1:
                    id = id + 1;
                    System.out.println("--------------------------");
                    System.out.println("Preencha os campos abaixo:");

                    System.out.print("Nome do livro: ");
                    String name = sc.nextLine();

                    System.out.print("Sinopse: ");
                    String synopsis = sc.nextLine();

                    System.out.print("Ano de lançamento: ");
                    int year = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Editora: ");
                    String publisher = sc.nextLine();

                    b = new Book(id, name, synopsis, year, publisher);
                    list.add(b);
                    System.out.println();
                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("Não há resultados!");
                        System.out.println("------------------");
                    } else {
                        for (Book book : list) {
                            System.out.print(book);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Código do livro a ser removido: ");
                    int code = sc.nextInt();
                    System.out.println();
                    System.out.println(b.removeBook(list, code));
                    break;

                case 4:
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