void main() {
    Participante pessoa = new Participante();
    ExperienciaCultural experiencia = new ExperienciaCultural();
    ShowMusical show = new ShowMusical();
    OficinaCriativa oficina = new OficinaCriativa();
    Scanner entrada = new Scanner(System.in);

    System.out.println("Sistema de Experiências Culturais e Oficinas Criativas");
    pessoa.cadastrarparticipante(entrada);

    experiencia.cadastrarExperiencia(entrada);
    System.out.println("Escolha o tipo de experiencia");
    System.out.println("1 - Show musical");
    System.out.println("2 - Oficina Criativa");
    int num = entrada.nextInt();
    entrada.nextLine();
    if (num == 1){
        show.cadastrarShow(entrada);
    } else if (num == 2) {
        oficina.cadastrarOficina(entrada);
    }
    else{
        System.out.println("Opção invalida");
    }

    System.out.println("dados cadastrados: ");
    pessoa.exibirDados();
    experiencia.ExibirDados();
    if (num == 1){
        show.ExibirDadosS();
    } else if (num == 2) {
        oficina.ExibirDadosO();
    }
    experiencia.realizarInscricao();
    experiencia.ExibirDados();
}
