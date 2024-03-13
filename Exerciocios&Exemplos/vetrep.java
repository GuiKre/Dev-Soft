import java.util.Scanner;

public class vetrep {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        //vetores e repetidores

        //declaração
        int[] vetor1;
        //declaração e inicialização
        int[] vetor2 = new int[3];
        //declaração, inicialização e atribuição
        int[] vetor3 = new int[]{1, 5, 2};

        //inicialização
        vetor1 = new int[2];
        vetor1[0] = 45;
        vetor1[1] = 32;

        //recuperação de valor
        int vlrVetor3 = vetor3[2];
        int vlrVetor2 = vetor2[1];

        //impressão de valores
        System.out.println("Valor vetor 2: " + vlrVetor2);
        System.out.println("Valor vetor 3: " + vlrVetor3);

        //atribuição de valores
        int contador = 0;
        do {
            System.out.println("Digite um valor: ");
            int vlr = leitor.nextInt();
            vetor2[contador] = vlr;
            contador++;
        } while (contador < 3);

    }

}
