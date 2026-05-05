import java.util.Scanner;

public class Participante {
    private int id;
    private String nome;
    private int CPF;
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

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
    public int getCPF() {
        return CPF;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void cadastrarparticipante(Scanner entrada){
        System.out.println("Cadastro de Clientes!");
        System.out.println("Identificação: ");
        setId(entrada.nextInt());
        entrada.nextLine();
        System.out.println("Nome: ");
        setNome(entrada.nextLine());
        System.out.println("CPF: ");
        setCPF(entrada.nextInt());
        entrada.nextLine();
        System.out.println("Email: ");
        setEmail(entrada.nextLine());
    }

}
