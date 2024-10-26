package Livraria.Livraria;

import java.util.Scanner;

public class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn;
    String nomeAutor;
    String emailAutor;
    String cpfAutor;

    Livro(String nome, String descricao, double valor, String isbn) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.isbn = isbn;
    }
    Livro(){}

    void mostrarDetalhes(){
        System.out.println("\n Identificação do livro \n_________________________");
        System.out.println(" Nome: " + nome);
        System.out.println(" Descrição: " + descricao);
        System.out.println(" Isbn: " + isbn);
        System.out.println(" Valor: R$" + valor);
        System.out.println("");
    }

}

