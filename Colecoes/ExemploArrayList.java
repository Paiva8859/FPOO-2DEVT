package Colecoes;
import java.util.*;
import java.util.Random;

public class ExemploArrayList {
    //CRIANDO A ARRAYLIST
    ArrayList<String> carros = new ArrayList<>();
    ArrayList<Integer> numeros = new ArrayList<>();

    public void test() {
        //PREENCHENDO O ARRAYLIST
        carros.add("Fusca");
        carros.add("Monza");
        carros.add("Chevette");

        //IMPRIMINDO A ARRAYLIST
        System.out.println(carros);

        //PERCORRENDO A ARRAYLIST COM FOR
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }

        //PERCORRENDO A LISTA COM FOR-EACH
        for (String string : carros) {
            System.out.println(string);
        }

        //ORDENANDO EM ORDEM ALFABÉTICA A ARRAYLIST COM COLLECTIONS.SORT
        Collections.sort(carros);
        System.out.println(carros);

        //LIMPANDO A ARRAYLIST
        carros.clear();
        System.out.println(carros);
    }

    public void exercicio1() {

        for (int i = 0; i < 5; i++) {
            Random x = new Random();
            numeros.add(x.nextInt(0, 100));
        }

        System.out.println(numeros);

        Collections.sort(numeros);
        System.out.println(numeros);
    }
}