package Livraria.OutraLivraria;

public class Livro {
    private String titulo;
    private String descricao;
    private String isbn;
    private double valor;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(String titulo){
        return titulo;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(String descricao){
        return descricao;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public String getIsbn(String isbn){
        return isbn;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValor(double valor){
        return valor;
    }
}
