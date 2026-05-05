import java.util.Scanner;

public class DroneAereo extends EquipamentoMonitoramento{
    int qntHelices;
    float alcanceMax;
    boolean cameratermica;

    public void cadastrarDrone(Scanner dados){
        System.out.println("digite a quantidade de helices do drone: ");
        qntHelices = dados.nextInt();
        dados.nextLine();

        System.out.println("digite o alcance maximo do drone em metros: ");
        alcanceMax = dados.nextFloat();
        dados.nextLine();

        System.out.println("o drone tem camera termica (true/false): ");
        cameratermica = dados.nextBoolean();
        dados.nextLine();
    }
    public void exibirDadosD(){
        System.out.println("Dados do Drone:");
        System.out.println("quantidade de helices:" + qntHelices);
        System.out.println("alcance maximo: " + alcanceMax + " m");
        System.out.println("tem camera termica: " + cameratermica);

    }
}
