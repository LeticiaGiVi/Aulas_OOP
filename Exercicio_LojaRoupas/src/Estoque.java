import java.util.Scanner;

public class Estoque {
    String tamanho;
    int quantidade;

    // arquivo de onde vem , nome do objeto, nome da classe
    CadastroRoupas roupa = new CadastroRoupas();


    public void atualizarEstoque(Scanner entrada){
    System.out.println("Tamanho: ");
    tamanho = entrada.nextLine();

    System.out.println("Quantidade: ");
    quantidade = entrada.nextInt();
    }
}
