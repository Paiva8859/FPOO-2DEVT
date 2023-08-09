package Colecoes;

import java.util.*;

public class ExemploLinkedList {
    LinkedList<String> pessoas = new LinkedList<>();

    public void test() {
        pessoas.add("Pedro");
        pessoas.add("Maria");
        pessoas.add("João");
        
        pessoas.addFirst("Cecília");

        pessoas.removeLast();

        System.out.println(pessoas);
    }
}
