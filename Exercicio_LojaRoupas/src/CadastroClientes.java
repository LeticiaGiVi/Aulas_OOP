import java.util.Scanner;

public class CadastroClientes {
    int numero;
    String nome;
    String CPF;
    String telefone;


    public void cadastrarCliente(Scanner entrada){
    System.out.println("Informe o numero de cadastro do cliente: ");
    numero = entrada.nextInt();

    entrada.nextLine();

    System.out.println("Nome: ");
    nome = entrada.nextLine();

    System.out.println("CPF: ");
    CPF = entrada.nextLine();

    System.out.println("Telefone: ");
    telefone = entrada.nextLine();
    }
}
