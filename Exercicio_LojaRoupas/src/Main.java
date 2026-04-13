void main() {
    CadastroClientes cliente  = new CadastroClientes();
    Estoque material =new Estoque();

    //Scanner é uma classe nativa do java || System.in para coletar as informações do usuario
    Scanner entrada = new Scanner(System.in); //para ler as entradas do usuario

    System.out.println("Cadastrando Clientes...."); //Equivalente ao print no python || System.out manda informações para o ususario
    cliente.cadastrarCliente(entrada);

    System.out.println("Cadastrando Roupas.....");
    material.roupa.cadastrarRoupa(entrada);

    System.out.println("Atualizando estoque.....");
    material.atualizarEstoque(entrada);

    System.out.println("Apresentando cadastros realizados...");
    System.out.println("Cliente:");
    System.out.println("Nome: " + cliente.nome);
    System.out.println("Numero: " + cliente.numero);
    System.out.println("CPF: " + cliente.CPF);
    System.out.println("Tel: "+cliente.telefone);
    System.out.println("Material: ");
    System.out.println("Codigo de barras: " + material.roupa.codigoDeBarras);
    System.out.println("Descricao: " + material.roupa.descricao);
    System.out.println("genero: " + material.roupa.genero);
    System.out.println("tamanho: "+ material.tamanho);
    System.out.println("quantidade: " + material.quantidade);



}
