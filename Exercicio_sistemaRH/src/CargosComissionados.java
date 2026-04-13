import java.util.Scanner;
public class CargosComissionados extends CadastrarFuncionarios{
    double partLucros;
    double qtdQuotas;

    public void cadastrarComis(Scanner entrada){
        System.out.println("Participação nos lucros(%):");
        partLucros = entrada.nextDouble();
        System.out.println("Quantidade de Quotas:");
        qtdQuotas = entrada.nextDouble();
    }
}
