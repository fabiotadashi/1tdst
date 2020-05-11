package resolucao_strings_livro;

import javax.swing.*;

public class TesteLivro {

    public static void main(String[] args) {

        // Criar instância da classe Livro
        Livro livro = new Livro();

        // Definir valores dos atributos
        livro.setTituloOriginal("Lords of the Rings");
        livro.setTituloPortugues("Senhor dos Anéis");
        livro.setAnoPublicacao(1954);
        livro.setQuantidadeDePaginas(800);
        livro.setEdicao("3a edição");
        livro.setIsbn("1239871239823-12");
        livro.setAutor("Tolkien");

        // Criar outra instância da classe Livro
        Livro livro1 = new Livro();

        // Definir valores dos atributos
        livro1.setTituloOriginal("Game of Thrones");
        livro1.setTituloPortugues("Guerra dos Tronos");
        livro1.setAnoPublicacao(2019);
        livro1.setQuantidadeDePaginas(600);
        livro1.setEdicao("Edição 1");
        livro1.setIsbn("091283129-123-123");
        livro1.setAutor("George R.R. Martin");

        JOptionPane.showMessageDialog(null, livro.pegarTitulos());
        JOptionPane.showMessageDialog(null, livro1.pegarTitulos());

    }

}
