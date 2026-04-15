import java.util.Scanner;

public class Pizza {
    int id;
    String nome;
    String ingredientes;
    char tamanho;

    public void cadastrarPizza(Scanner entrada){
        System.out.println("Informe a idenmtificação da pizza:");
        id = entrada.nextInt();

        entrada.nextLine();
    }
}
