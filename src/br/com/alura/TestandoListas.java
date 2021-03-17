package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    // ArrayList tipo genérico
    public static void main1(String[] args) {
        String aula1 = "a. primeira string";
        String aula2 = "b. segunda string";
        String aula3 = "a. terceira string";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);


        // aulas.remove(aula2);

        // FOREACH - percorrendo uma lista com foreach
        // o primeiro seria o objeto da iteração e o segundo argumento a collection
//        for (String aula : aulas ) {
//            System.out.println(aula);
//        }

        // A classe Collections tem muitos métodos estáticos que nos ajudam em várias ações
        // uma delas é ordernar uma lista de forma simples, porém somente de forma asc, se quisermos mais recursos temos que criar um comparador
        Collections.sort(aulas);

        // FOR - primeiro iniciamos a variavel depois criamos o critério de endloop e depois incrementamos
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println(aulas.get(i));
        }

//        String segundoElemento = aulas.get(1);
//        System.out.println(segundoElemento);

    }
}
