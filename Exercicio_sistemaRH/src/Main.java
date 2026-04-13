import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        CadastrarFuncionarios pessoa = new CadastrarFuncionarios();
        CargosComissionados cargoEspecial = new CargosComissionados();

        Scanner entrada =  new Scanner(System.in);

        int cargo;
        System.out.println("Cadastro de Funcionarios!");
        System.out.println("Escolha conforme o menu:");
        System.out.println("1 - cargo comissonado");
        System.out.println("2 - outros cargos");
        cargo = entrada.nextInt();
        if(cargo == 1){
            //cargo comissionado
            cargoEspecial.cadastrarFunc(entrada);
            cargoEspecial.cadastrarComis(entrada);

            System.out.println("Funcionarios cadastrados: ");
            System.out.println("Nome: " + cargoEspecial.nome);
            System.out.println("endereço: " + cargoEspecial.endereco);
            System.out.println("Telefone: " + cargoEspecial.telefone);
            System.out.println("Data de Admissão: " + cargoEspecial.dataAdimissao);
            System.out.println("Cargo: " + cargoEspecial.cargo);
            System.out.println("Salario inicial:" + cargoEspecial.salarioInicial);
            System.out.println("participação nos lucros" + cargoEspecial.partLucros);
            System.out.println("Quantidade de cotas: " + cargoEspecial.qtdQuotas);
        }
        else{
            //cargo padrão
            pessoa.cadastrarFunc(entrada);

            System.out.println("Funcionarios cadastrados: ");
            System.out.println("Nome: " + pessoa.nome);
            System.out.println("endereço: " + pessoa.endereco);
            System.out.println("Telefone: " + pessoa.telefone);
            System.out.println("Data de Admissão: " + pessoa.dataAdimissao);
            System.out.println("Cargo: " + pessoa.cargo);
            System.out.println("Salario inicial:" + pessoa.salarioInicial);
        }
    }

}