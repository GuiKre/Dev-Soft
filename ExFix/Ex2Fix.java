import java.util.Scanner;

public class Ex2Fix {

   public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        //Um aluno
        // String matricula;
        // String nome;
        // double nota1;
        // double nota2;
        //Aluno objAluno = new Aluno();


        //Cinco alunos
        int qtd = 5;
        // String[] matriculas = new String[qtd];
        // String[] nomes = new String[qtd];
        // double[] notas1 = new double[qtd];
        // double[] notas2 = new double[qtd];
        Aluno[] alunos = new Aluno[qtd];
        alunos[0] = new Aluno();

        System.out.println("Digite a matrícula:");
        alunos[0].matricula = leitor.nextLine();
        System.out.println("Digite o nome:");
        alunos[0].nome = leitor.nextLine();
        System.out.println("Digite a nota 1:");
        alunos[0].nota1 = leitor.nextDouble();
        System.out.println("Digite a nota 2:");
        alunos[0].nota2 = leitor.nextDouble();

        System.out.println("Matrícula: " + alunos[0].matricula);
        System.out.println("Nome: " + alunos[0].nome);
        System.out.println("Nota 1: " + alunos[0].nota1);
        System.out.println("Nota 2: " + alunos[0].nota2);


        leitor.close();
   }

}
