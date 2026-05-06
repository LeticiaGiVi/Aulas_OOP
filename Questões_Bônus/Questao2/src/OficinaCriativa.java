import java.util.Scanner;

public class OficinaCriativa extends ExperienciaCultural{
    private String material;
    private float cargaHoraria;
    private String nivelDificuldade;

    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }

    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setNivelDificuldade(String nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }
    public String getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void cadastrarOficina(Scanner entrada){
        System.out.println("\nCadastro Oficina: ");
        System.out.println("Material Principal utilizado: ");
        setMaterial(entrada.nextLine());
        System.out.println("Carga horaria: ");
        setCargaHoraria(entrada.nextFloat());
        entrada.nextLine();
        System.out.println("Nivel de dificuldade(f/m/d)");
        setNivelDificuldade(entrada.nextLine());
    }
    public void ExibirDadosO(){
        System.out.println("\ndados cadastrados Oficina");
        System.out.println("Material Principal: " + getMaterial());
        System.out.println("Carga horaria: " + getCargaHoraria());
        System.out.println("Nivel de dificuldade: " + getNivelDificuldade());
    }
}
