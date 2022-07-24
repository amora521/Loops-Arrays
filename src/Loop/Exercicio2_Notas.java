package Loop;

import java.util.Scanner;

public class Exercicio2_Notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();
//        o programa nunca vai entrar no while, a não ser que a nota seja menor que 0 ou maior que 10
        while(nota < 0 || nota > 10){
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scan.nextInt();
        }
    }
}
