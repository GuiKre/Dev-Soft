import java.util.Scanner;

public class Ex4 {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt();

        if (idade <= 13) {
            System.out.println("Criança");
        }else if (idade > 13 & idade <= 18){
            System.out.println("Adolescente");
        }else if (idade > 18 & idade <=60) {
            System.out.println("Adulto");
        }else{
            System.out.println("Idoso");
        }
    }


}
