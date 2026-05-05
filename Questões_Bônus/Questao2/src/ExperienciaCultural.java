import java.util.Scanner;

public class ExperienciaCultural {
    private int id;
    private String nome;
    private float valor;
    private int qntInscricoes;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    public float getValor() {
        return valor;
    }

    public void setQntInscricoes(int qntInscricoes) {
        this.qntInscricoes = qntInscricoes;
    }
    public int getQntInscricoes() {
        return qntInscricoes;
    }

    public void cadastrarExperiencia(Scanner entrada){
        System.out.println("Cadastro de Experiencia:");
        System.out.println("Identificação: ");
        setId(entrada.nextInt());
        entrada.nextLine();
        System.out.println("Nome: ");
        setNome(entrada.nextLine());
        System.out.println("Valor: ");
        setValor(entrada.nextFloat());
        entrada.nextLine();
        System.out.println("Quantidade de inscrições");
        setQntInscricoes(entrada.nextInt());
        entrada.nextLine();
    }
    public void  realizarInscricao(){
        System.out.println("realizando nova inscrição");
        qntInscricoes += 1;
    }
    public void ExibirDados(){
        System.out.println("dados cadastrados Experiencia");
        System.out.println("Identificação: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Valor: " + getValor());
        System.out.println("Quantidade de inscrições: " + getQntInscricoes());
    }
}
