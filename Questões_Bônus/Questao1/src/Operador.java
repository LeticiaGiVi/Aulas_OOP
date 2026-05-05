import java.util.Scanner;

public class Operador {
    int id;
    String nome;
    String matricula;
    int telefone;

    public void cadastrarOperador(Scanner dados){
        System.out.println("Digite o id do operador: ");
        id = dados.nextInt();
        dados.nextLine();

        System.out.println("Digite o nome do operador: ");
        nome = dados.nextLine();

        System.out.println("digite o codigo de matricula: ");
        matricula = dados.nextLine();

        System.out.println("digite o numero de telefone: ");
        telefone = dados.nextInt();
        dados.nextLine();
    }
    public void exibirDados(){
        System.out.println("Dados do operador:");
        System.out.println("id: " + id);
        System.out.println("nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Telefone: " + telefone);

    }
}
