package Livraria;

public class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn;
    String nomeAutor;
    String emailAutor;
    String cpfAutor;

    Livro(String nome, String descricao, double valor, String isbn, String nomeAutor, String emailAutor, String cpfAutor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.isbn = isbn;
        this.nomeAutor = nomeAutor;
        this.emailAutor = emailAutor;
        this.cpfAutor = cpfAutor;
    }
    Livro(){}

    void mostrarDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Isbn: " + isbn);
        System.out.println("Nome do Autor: " + nomeAutor);
        System.out.println("Email do Autor: " + emailAutor);
        System.out.println("CPF do Autor: " + cpfAutor);
        System.out.println("");
    }
}

