package entidades;

public class Livro extends Autor{

    private String titulo;

    private String genero;
    private Integer ano;
    private Integer numPaginas;

    private int id = 0;
    private static  Integer lasId = 0;


    public Livro(String titulo, String genero, Integer ano, Integer numPaginas, String nome, Integer idade, Integer qtLivros) {
        this.titulo = titulo;
        this.setNome(nome);
        this.setIdade(idade);
        this.genero = genero;
        this.ano = ano;
        this.numPaginas = numPaginas;
        this.setQtLivros(qtLivros);
        this.id = lasId + 1;
        lasId += 1 ;
    }
    public  int getId(){
        return id;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }



    public void imprimir(Cabecalho cabecalho){
        cabecalho.imprimir();
    }
    public void imprimir(Rodape rodape){
        rodape.imprimir();
    }

}
