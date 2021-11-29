package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição conteudo java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso.setTitulo("Curso Js");
        curso.setDescricao("Descrição conteudo Js");
        curso.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Spread Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Erick");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Erick " + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Erick " + dev.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Erick " + dev.getConteudosConluidos());
        System.out.println("XP: "+ dev.calcularTotalXp());

        System.out.println("*************");

        Dev dev1 = new Dev();
        dev.setNome("Camila");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Camila " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Camila " + dev1.getConteudosConluidos());
        System.out.println("XP: "+ dev.calcularTotalXp());

    }
}
