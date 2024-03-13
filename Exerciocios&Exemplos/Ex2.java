import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor em reais:");
        double real = leitor.nextDouble();

        System.out.println("Valor em dollares: " + real/5.17);
        System.out.println("Valor em euros: " + real/6.14);
        System.out.println("Valor em pesos argentinos: " + real/0.05);

    }    

}

