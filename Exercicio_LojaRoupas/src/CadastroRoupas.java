import java.util.Scanner;

public class CadastroRoupas {
    int codigoDeBarras;
    String descricao;
    String genero;

    public void cadastrarRoupa(Scanner entrada){
    System.out.println("Informe o codigo de barras da roupa nova: ");
    codigoDeBarras = entrada.nextInt();

    entrada.nextLine();

    System.out.println("Descrição: ");
    descricao = entrada.nextLine();

    System.out.println("Genero: ");
    genero = entrada.nextLine();

    }
}

