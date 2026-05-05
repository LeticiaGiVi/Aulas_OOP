import java.util.Scanner;

public class EquipamentoMonitoramento {
    int id;
    String fabricante;
    float nivelBateria;
    int qntMissoes;

    public void cadastrarEquipamento(Scanner dados){
        System.out.println("Digite o id do equipamento");
        id = dados.nextInt();
        dados.nextLine();

        System.out.println("Digite o fabricante do equipamento");
        fabricante = dados.nextLine();

        System.out.println("Digite o Nivel atual da bateria: ");
        nivelBateria = dados.nextFloat();
        dados.nextLine();

        System.out.println("Digite a quantidade de missões em que o equipamento foi usado");
        qntMissoes = dados.nextInt();
        dados.nextLine();
    }
    public void exibirDados(){
        System.out.println("Dados do Equipamento:");
        System.out.println("id:" + id);
        System.out.println("fabricante: " + fabricante);
        System.out.println("Nivel de bateria: " + nivelBateria);
        System.out.println("quantidade de missões: " + qntMissoes);

    }
    public void realizarMissao(){
        System.out.println("equipameto realizando missão");
        qntMissoes += 1;
    }
}
