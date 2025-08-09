package br.com.dio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso() {}

    public int getCargaHoraria() { return cargaHoraria; }
    public void setCargaHoraria(int cargaHoraria) { this.cargaHoraria = cargaHoraria; }

    @Override
    public double calcularXp() {
        return 10d * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{titulo='" + titulo + "', carga=" + cargaHoraria + "}";
    }
}
