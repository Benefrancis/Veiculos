package br.com.fiap.view;

import br.com.fiap.model.Veiculo;

import javax.swing.*;
import java.time.Year;

public abstract class VeiculoView {

    public static Veiculo form() {
        String nome = JOptionPane.showInputDialog("Nome do veículo", "NIVUS");

        short ano = Short.parseShort(JOptionPane.showInputDialog("ano", Year.now()));

        String cor = JOptionPane.showInputDialog("cor", "PRATA");

        String modelo = JOptionPane.showInputDialog("Modelo", "Hightline");

        var veiculo = new Veiculo();
        veiculo.setNome(nome).setModelo(modelo).setAno(ano).setCor(cor);

        return veiculo;
    }


    public static Long formFindById(){
        return Long.valueOf(JOptionPane.showInputDialog("Informe o id do veículo"));
    }

}
