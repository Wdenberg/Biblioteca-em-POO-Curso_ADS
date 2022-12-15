package entidades;

public class Rodape {

    private String rodape;


    public String getRodape() {
        return rodape;
    }

    public void setRodape(String rodape) {
        this.rodape = rodape;
    }

    public void imprimir(){
        System.out.println(this.getRodape());
    }
}
