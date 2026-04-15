package br.com.fiap.bean;

import java.time.LocalDate;
import java.time.Period;

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
    //Métodos da classe
    public int calcularIdade(){
        LocalDate dataAtual = LocalDate.now();
        Period idade = Period.between(dataDeNascimento, dataAtual);
        return  idade.getYears();
    }
}
