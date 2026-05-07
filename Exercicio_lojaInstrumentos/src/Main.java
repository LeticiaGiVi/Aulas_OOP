import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InstrumentoMusical[] instrumentos = new InstrumentoMusical[10];
        Scanner entrada = new Scanner(System.in);
        /*
        instrumento.setModelo("piano");
        instrumentos[0] = instrumento;

        String modelo = instrumentos[0].getModelo();
        System.out.println(modelo);
        */
        int c;
        for (c=0;c< instrumentos.length;c++){
            InstrumentoMusical instrumento = new InstrumentoMusical();
            System.out.println("Digite o modelo do istrumento " + (c+1) + ":");
            instrumento.setModelo(entrada.nextLine());

            instrumentos[c] = instrumento;
        }
        c=0;
        for(InstrumentoMusical instrumento : instrumentos){
            if(c<instrumentos.length){
                c++;
                System.out.println("Modelo do Instrumento: "+ c + " " +instrumento.getModelo());
            }
        }
    }
}