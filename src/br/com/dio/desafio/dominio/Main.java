package br.com.dio.desafio.dominio;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição java");
        curso.setCargaHoraria(8);

        System.out.println(curso);
    }
}
