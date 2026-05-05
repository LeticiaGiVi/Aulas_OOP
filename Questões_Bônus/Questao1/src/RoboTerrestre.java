import java.util.Scanner;

public class RoboTerrestre extends EquipamentoMonitoramento{
    String tipoTracao;
    int capacidadeCarga;
    boolean sensorUmidade;

    public void cadastrarRobo(Scanner dados){
        System.out.println("digite tipo de tração do robo: ");
        tipoTracao = dados.nextLine();

        System.out.println("digite a capacidade maxima do robo em kg: ");
        capacidadeCarga = dados.nextInt();
        dados.nextLine();

        System.out.println("o robo tem sensor de umidade (true/false): ");
        sensorUmidade = dados.nextBoolean();
        dados.nextLine();
    }
    public void exibirDadosR(){
        System.out.println("Dados do Robo:");
        System.out.println("tipo de tracao:" + tipoTracao);
        System.out.println("capacidade maxima: " + capacidadeCarga + " kg");
        System.out.println("tem sensor de umidade: " + sensorUmidade);

    }
}
