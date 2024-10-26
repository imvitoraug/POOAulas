package Livraria.Livraria;

public class Autor {
    private String nome;
    private String email;
    private String cpf;

    Autor(String nome, String email, String cpf){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;

    }

    Autor(){}

    void mostrarDetalhes(){
        System.out.println("\n Identificação do autor:");
        System.out.println("___________________________");
        System.out.println("\n  Nome do autor: "  + nome);
        System.out.println("    Email do autor: " + email);
        System.out.println("    CPF do autor: " + cpf);
        System.out.println("");
    }

}
