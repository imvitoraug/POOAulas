package Livraria.Livraria;

public class CadastrarLivro {
    public static void main(String[] args) {

        Livro livroJava = new Livro("Java, a história", "Este livro mostra a história da criação da linguagem Java.",
                250.98, "1ef3-1290");
        livroJava.mostrarDetalhes();

        Autor autor = new Autor("Vitor Augusto", "vitorsampi16@gmail.com", "075.716.794-46");
        autor.mostrarDetalhes();
    }
}

