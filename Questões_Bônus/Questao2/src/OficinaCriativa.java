public class OficinaCriativa extends ExperienciaCultural{
    private String material;
    private float cargaHoraria;
    private char nivelDificuldade;

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

    public void setNivelDificuldade(char nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }
    public char getNivelDificuldade() {
        return nivelDificuldade;
    }
}
