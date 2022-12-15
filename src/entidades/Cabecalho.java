package entidades;

public class Cabecalho {

    private String titulo;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void imprimir(){
        System.out.println(this.getTitulo());
    }
}
