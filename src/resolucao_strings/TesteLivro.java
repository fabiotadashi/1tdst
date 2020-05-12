package resolucao_strings;

import javax.swing.*;

public class TesteLivro {

    public static void main(String[] args) {

        // Criar instância da classe Livro
        Livro livro = new Livro("1239871239823-12",
                "Lords of the Rings",
                "Senhor dos Anéis",
                "Tolkien",
                800,
                "3a edição",
                1954);

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
        JOptionPane.showMessageDialog(null, livro1.pegarTitulos(), "Livraria", JOptionPane.INFORMATION_MESSAGE);

    }

}
