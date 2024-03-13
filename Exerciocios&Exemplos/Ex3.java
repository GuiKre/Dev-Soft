import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Escreva um número A: ");
        double A = leitor.nextDouble();
        System.out.print("Escreva um outro número B: ");
        double B = leitor.nextDouble();

        if (A>B) {
            System.out.println("Número A maior que B.");
        }else if (A==B) {
            System.out.println("Números iguais.");
        }else {
            System.out.println("Número A menor que B.");
        }

    }

}
