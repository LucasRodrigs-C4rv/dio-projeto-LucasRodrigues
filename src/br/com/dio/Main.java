package br.com.dio;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java POO - Fundamentos");
        curso1.setDescricao("Introdução à POO em Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Estruturas de Dados");
        curso2.setDescricao("Listas, Sets e Maps");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Carreira");
        mentoria.setDescricao("Dicas para entrevistas e currículo");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp DIO - Exemplo");
        bootcamp.setDescricao("Bootcamp de práticas");
        bootcamp.addConteudo(curso1);
        bootcamp.addConteudo(curso2);
        bootcamp.addConteudo(mentoria);

        Dev devLucas = new Dev("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Inscritos: " + devLucas.getConteudosInscritos());
        devLucas.progredir(); // conclui o primeiro
        devLucas.progredir(); // conclui o segundo
        System.out.println("Concluidos: " + devLucas.getConteudosConcluidos());
        System.out.println(devLucas);
    }
}
