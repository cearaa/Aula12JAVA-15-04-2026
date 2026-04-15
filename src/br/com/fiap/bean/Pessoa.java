package br.com.fiap.bean;

import java.time.LocalDate;

public class Pessoa {
    //Atributos
    private String nome;
    private LocalDate dataDeNascimento;

    //Construtores ( Alt + insert )
    public Pessoa() {
    }
    public Pessoa(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }
    //Métodos getters/setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
