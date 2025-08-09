package br.com.dio;

public abstract class Conteudo {
    protected String titulo;
    protected String descricao;

    public abstract double calcularXp();

    // getters e setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}
