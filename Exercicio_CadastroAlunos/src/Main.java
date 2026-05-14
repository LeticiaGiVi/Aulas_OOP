import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas salas voce quer cadastrar");
        int num = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Quantos alunos voce quer por sala");
        int num2 = entrada.nextInt();
        entrada.nextLine();
        //num = linhas -- num2 = colunas
        CadastroSala[][] sala = new CadastroSala[num][num2];

        int l,c;
        for(l = 0; l < sala.length; l++) {
            CadastroSala cadastroSala = new CadastroSala();
            System.out.println("digite o numero da sala" + (l+1) + ": ");
            cadastroSala.setNumSala(entrada.nextInt());
            entrada.nextLine();
            System.out.println("Cadastros de alunos da sala" + cadastroSala.getNumSala() + ":");
            for (c = 0; c < sala[0].length; c++) {
                System.out.println("Digite o nome do aluno " + (c + 1) + ": ");
                cadastroSala.setAluno(entrada.nextLine());

                sala[l][c] = cadastroSala;
            }
        }
        c = 0;
        l = 0;
        for (CadastroSala[] cadastro : sala){
            if(l < sala.length) {
                l++;
            }
            System.out.println("Alunos cadastrados na sala" + sala[l][c].getNumSala() + " :" );

            for (CadastroSala cad : cadastro){
                if(c< sala[0].length){
                    c++;
                }
                System.out.println("Aluno " +c+": "+ cad.getAluno());

            }
        }

    }
}