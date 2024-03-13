import java.util.Scanner;

public class Ex1Fix {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIgite a matrícula do aluno: ");
        int mat = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.nextLine();
        System.out.println("Digite a nota1 do aluno: ");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite a nota2 do aluno: ");
        double nota2 = leitor.nextDouble();

        double notafinal = (nota1 + nota2) / 2;

        if (notafinal > 6) {
            System.out.println("Matrícula: " + mat);
            System.out.println("Nome: " + nome);
            System.out.println("Aprovado: ( x ) Sim ( ) Não");
            System.out.println("Nota final: " + notafinal);
        }else{
            System.out.println("Matrícula: " + mat);
            System.out.println("Nome: " + nome);
            System.out.println("Aprovado: ( ) Sim ( x ) Não");
            System.out.println("Nota final: " + notafinal);
        }

    }

}
