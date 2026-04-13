import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class CadastrarFuncionarios {
    String nome;
    String endereco;
    String telefone;
    Date dataAdimissao;
    String cargo;
    double salarioInicial;

    public void cadastrarFunc(Scanner entrada) throws ParseException {
        System.out.println("Nome:");
        nome = entrada.nextLine();
        System.out.println("Endereço:");
        endereco = entrada.nextLine();
        System.out.println("telefone:");
        telefone = entrada.nextLine();
        System.out.println("Data de adimissão:");
        String data = entrada.nextLine();
        SimpleDateFormat sdfFormat = new SimpleDateFormat("dd/MM/yyyy");
        dataAdimissao = sdfFormat.parse(data);
        System.out.println("Cargo:");
        cargo = entrada.nextLine();
        System.out.println("Salario Inicial:");
        salarioInicial = entrada.nextDouble();
    }

}
