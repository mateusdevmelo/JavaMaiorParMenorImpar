/* como criar uma lista de numeros em java,
depois verificar quais deles sao pares e depois printar o maior deles,
e depois printar o menos dos impares
*/



import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //criar uma lista de números
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(25);
        numeros.add(82);
        numeros.add(93);
        numeros.add(19);
        numeros.add(15);
        numeros.add(12);
        numeros.add(2);

        // Variáveis para armazenar o maior número par e o menor número ímpar
        Integer maiorPar = null;
        Integer menorImpar = null;

        // Verificar quais números são pares e imprimir o maior deles
        for(Integer numero : numeros) {
           if(numero % 2 == 0) {
               if(maiorPar == null || numero > maiorPar) {
                   maiorPar = numero;
               }
           } else {
               if(menorImpar == null || numero < menorImpar) {
                   menorImpar = numero;
               }
           }
        }

        if (maiorPar != null) {
            System.out.println("Maior número par: " + maiorPar);
        } else {
            System.out.println("Não há números pares na lista.");
        }

        // Imprimir o menor número ímpar
        if (menorImpar != null) {
            System.out.println("Menor número ímpar: " + menorImpar);
        } else {
            System.out.println("Não há números ímpares na lista.");
        }
    }
}