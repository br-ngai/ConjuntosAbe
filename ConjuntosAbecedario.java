
package com.mycompany.conjuntosabecedario;

/**
 *
 * @author Brandon Hernandez Moreno
 * @email. beu7www@gmail.com
 */
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;


public class ConjuntosAbecedario {
    public static void main(String[] args) {
        
        HashSet<Character> abecedario = new HashSet<>();
        
        for (char a = 'a'; a <= 'z'; a++) {
            abecedario.add(a);
            
        }
        
        System.out.println("El abecedario es: " + abecedario);

        
        HashSet <Integer> enteros = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            enteros.add(i);
        }
        
        for (int i = -300; i < 0; i++) {
            enteros.add(i);
            
        }

        System.out.println("Los números mayores a -300 y menores a 100 son: " + enteros);
        
         HashSet <Integer> NumPares = new HashSet<>();
        for (int i = 0; i <= 400; i+=2) {
            NumPares.add(i);
            
        }
        System.out.println("Los números pares menores a 400 son: " + NumPares);
        
        
        NumPares.addAll(enteros);
        System.out.println("La unión de los conjuntos es: " + NumPares);
        
        SortedSet subconjunto = new TreeSet();
        
        subconjunto.addAll(enteros);
        subconjunto.addAll(NumPares);
        
        System.out.println("El subconjunto de C es: " + subconjunto.subSet(-300, 400));
        
        enteros.retainAll(NumPares);
        System.out.println("La intersección es: " + enteros);
    }
    
}
