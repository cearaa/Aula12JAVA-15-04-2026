package br.com.fiap.bean;

import javax.swing.*;
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
        setDataDeNascimento(dataDeNascimento);
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
        LocalDate inicio = LocalDate.parse("1899-31-12");
        //Ou: LocalDate inicio = LocalDate.parse("1900-01-01").minusDays(1);
        LocalDate fim = LocalDate.now();
        //Ou: LocalDate fim = LocalDate.now().plusDays(1);
        try {
            if (dataDeNascimento.isAfter(inicio) && dataDeNascimento.isBefore(fim)) {
                this.dataDeNascimento = dataDeNascimento;
            } else {
                throw new Exception("Data fora dos parâmetros permitidos!! (Entre 1900-01-01 ao dia de hoje");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(2); //Encerrando o programa após mensagem de erro.
        }
    }
    //Métodos da classe
    public int calcularIdade(){
        LocalDate dataAtual = LocalDate.now();
        Period idade = Period.between(dataDeNascimento, dataAtual);
        return  idade.getYears();
    }
}
