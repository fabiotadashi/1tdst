package sobrecarga_overload;

import resolucao_strings.Livro;

public class Pessoa {

    private String nome;
    private int idade;
    private Carro carro;
    private Livro livro;

    public Pessoa(){}

    public Pessoa(String nome, int idade, Carro carro, Livro livro) {
        this.nome = nome;
        this.idade = idade;
        this.carro = carro;
        this.livro = livro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
