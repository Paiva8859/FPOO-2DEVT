package Colecoes;
import java.util.*;

public class ExemploHashMap {
    HashMap<String, String> capitalEstado = new HashMap<>();

    public void test() {
        capitalEstado.put("SP", "São Paulo");
        capitalEstado.put("RJ", "Rio de Janeiro");
        capitalEstado.put("MG", "Belo Horizonte");
        capitalEstado.put("ES", "Vitória");

        System.out.println(capitalEstado.get("ES"));

        for (String i : capitalEstado.keySet()) {
            System.out.println(i + ": " + capitalEstado.get(i));
        }
    }

    public void exercicio1() {
        HashMap<String, Integer> pessoaIdade = new HashMap<>();

        pessoaIdade.put("Gabriel", 17);
        pessoaIdade.put("Maria", 11);
        pessoaIdade.put("Julia", 4);

        for (String i : pessoaIdade.keySet()) {
            System.out.println(i + ": " + pessoaIdade.get(i));
        }
    }
}
