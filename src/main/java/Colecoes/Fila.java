package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        // Offer Add -> adicionem elementos na fila
        // Diference do comportamento é quando a fila está cheia!
        fila.add("Ana"); // retorna null
        fila.offer("Bia"); // lança uma exceção
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        // Peek e Element -> obtem o proximo elemento da fila (sem remover)
        // Diferença é o comportamento quando a fila esta vazia
        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // lança uma exceção
        System.out.println(fila.element());

        // Poll e Remove -> obtem o proximo elemento da fila e remove
        // Diferença é o comportamento quando a fila esta vazia

        System.out.println(fila.poll()); // retorna null
        System.out.println(fila.remove()); // lança uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        // fila.size();
        // fila.clear();
        // fila.isEmpty();
        // fila.contains(...);
    }
}