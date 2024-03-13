import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a altura do retângulo:");
        double altura = leitor.nextDouble();

        System.out.print("Digite a largura do retângulo:");
        double largura = leitor.nextDouble();

        double resultado = altura*largura;

        System.out.println("A área do retângulo é: " + resultado);

    }

}
