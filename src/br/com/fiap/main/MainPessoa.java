package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1;
        String auxiliar, nome, dataEUA;
        LocalDate dataNascimento;
        try {
            nome = JOptionPane.showInputDialog("Digite seu nome: ").toUpperCase();
            auxiliar = JOptionPane.showInputDialog("Dígite a data de nascimento (dia/mês/ano): ");
            //Arrumando a String no formato ano-mes-dia --> "10/11/1998"
            String ano = auxiliar.substring(6, 10);
            String mes = auxiliar.substring(3, 5);
            String dia = auxiliar.substring(0, 2);
            dataEUA = ano + "-" + mes + "-" + dia + "-"; //1998-11-10
            dataNascimento = LocalDate.parse(dataEUA);
            pessoa1 = new Pessoa(nome, dataNascimento);

            JOptionPane.showMessageDialog(null, String.format("Data formarto EUA\nData de Nascimento: %s ", pessoa1.getDataDeNascimento()));
            //Formatando a data no formato padrão dia-mes-ano
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            JOptionPane.showMessageDialog(null, String.format("Nome: %s\nData de Nascimento: %s\nIdade: %d anos", pessoa1.getNome(), pessoa1.getDataDeNascimento().format(dtf), pessoa1.calcularIdade()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}