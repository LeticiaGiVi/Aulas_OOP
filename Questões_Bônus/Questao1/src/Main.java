void main() {
    Operador tecnico = new Operador();
    EquipamentoMonitoramento equip = new EquipamentoMonitoramento();
    DroneAereo drone = new DroneAereo();
    RoboTerrestre robozin = new RoboTerrestre();

    Scanner entrada = new Scanner(System.in);

    System.out.println("cadastro do operador: ");
    tecnico.cadastrarOperador(entrada);

    System.out.println("Cadastro de Equipamento:");
    equip.cadastrarEquipamento(entrada);

    System.out.println("Que tipo de equipamento voce vai cadastrar? ");
    System.out.println("digite 1 para drones");
    System.out.println("ou 2 para robos");
    int num = entrada.nextInt();
    entrada.nextLine();

    if (num == 1){
        drone.cadastrarDrone(entrada);
    } else if (num == 2) {
        robozin.cadastrarRobo(entrada);
    }
    else{
        System.out.println("Voce digitou um numero invalido :(");
    }

    tecnico.exibirDados();
    equip.exibirDados();
    if (num == 1){
        drone.exibirDadosD();
    } else if (num == 2) {
        robozin.exibirDadosR();
    }

    equip.realizarMissao();
    equip.exibirDados();
}
