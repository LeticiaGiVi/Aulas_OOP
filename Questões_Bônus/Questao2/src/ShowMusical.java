import java.util.Scanner;

public class ShowMusical extends ExperienciaCultural {
    private String estiloMusical;
    private String setor;
    private boolean encontroArtistas;


    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }
    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getSetor() {
        return setor;
    }

    public void setEncontroArtistas(boolean encontroArtistas) {
        this.encontroArtistas = encontroArtistas;
    }
    public boolean getEncontroArtistas(){
        return encontroArtistas;
    }

    public void cadastrarShow(Scanner entrada){
        System.out.println("Cadastro Show: ");
        System.out.println("Estilo musical: ");
        setEstiloMusical(entrada.nextLine());
        System.out.println("Setor: ");
        setSetor(entrada.nextLine());
        System.out.println("Tem encontro com artistas?(true/false)");
        setEncontroArtistas(entrada.nextBoolean());
        entrada.nextLine();
    }
    public void ExibirDadosS(){
        System.out.println("dados cadastrados Show");
        System.out.println("Estilo musical: " + getEstiloMusical());
        System.out.println("Setor: " + getSetor());
        System.out.println("Tem encontro com artistas?: " + getEncontroArtistas());
    }
}
