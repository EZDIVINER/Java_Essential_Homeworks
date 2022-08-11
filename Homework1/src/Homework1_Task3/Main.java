package Homework1_Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название книни");
        String userTitle = in.nextLine();
        System.out.println("Введите автора книги");
        String userAuthor = in.nextLine();
        System.out.println("Введите содержание книги");
        String userContent = in.nextLine();

        Book book = new Book(userTitle, userAuthor, userContent);

        book.contentObj.show();
        book.titleObj.show();
        book.authorObj.show();


    }
}
