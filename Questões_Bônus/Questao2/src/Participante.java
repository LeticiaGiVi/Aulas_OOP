import java.util.Scanner;

public class Participante {
    private int id;
    private String nome;
    private String CPF;
    private String email;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getCPF() {
        return CPF;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void cadastrarparticipante(Scanner entrada){
        System.out.println("\nCadastro de participantes!");
        System.out.println("Identificação: ");
        setId(entrada.nextInt());
        entrada.nextLine();
        System.out.println("Nome: ");
        setNome(entrada.nextLine());
        System.out.println("CPF: ");
        setCPF(entrada.nextLine());
        System.out.println("Email: ");
        setEmail(entrada.nextLine());
    }

    public void exibirDados(){
        System.out.println("\nPaticipante cadastrado:");
        System.out.println("ID: " + getId());
        System.out.println("Nome: "+ getNome());
        System.out.println("CPF: " + getCPF());
        System.out.println("Email: "+ getEmail());
    }

}
