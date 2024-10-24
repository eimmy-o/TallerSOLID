package Seccion_A;

import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<LibroFisico> books = new ArrayList<>();

    public void addBook(LibroFisico book) {
        books.add(book);
    }
}

