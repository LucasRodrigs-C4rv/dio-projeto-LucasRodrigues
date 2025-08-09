package br.com.dio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria() { this.data = LocalDate.now(); }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    @Override
    public double calcularXp() {
        return 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{titulo='" + titulo + "', data=" + data + "}";
    }
}
