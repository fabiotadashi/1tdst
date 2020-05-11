package resolucao_strings;

public class Livro {

    // atributos
    private String isbn;
    private String tituloOriginal;
    private String tituloPortugues;
    private String autor;
    private int quantidadeDePaginas;
    private String edicao;
    private int anoPublicacao;

    // métodos da classe

    public String pegarTitulos(){
        return "TITULO: "
                .concat(getTituloOriginal())
                .concat(", TITULO EM PORTUGUES: ")
                .concat(getTituloPortugues());
    }

    // getters e setters

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public String getTituloPortugues() {
        return tituloPortugues;
    }

    public void setTituloPortugues(String tituloPortugues) {
        this.tituloPortugues = tituloPortugues;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidadeDePaginas() {
        return quantidadeDePaginas;
    }

    public void setQuantidadeDePaginas(int quantidadeDePaginas) {
        this.quantidadeDePaginas = quantidadeDePaginas;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
