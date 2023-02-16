package br.com.fiap.model;


import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "TBL_VEICULO")
public class Veiculo {

    @Id
    @GeneratedValue(generator = "SQ_VEICULO", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SQ_VEICULO", allocationSize = 1, sequenceName = "SQ_VEICULO", initialValue = 1)
    private Long id;

    private String nome;

    private short ano;

    private String cor;

    private String modelo;

    public Veiculo() {
    }

    public Veiculo(Long id, String nome, short ano, String cor, String modelo) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.cor = cor;
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
    }

    public Veiculo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Veiculo setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public short getAno() {
        return ano;
    }

    public Veiculo setAno(short ano) {
        this.ano = ano;
        return this;
    }

    public String getCor() {
        return cor;
    }

    public Veiculo setCor(String cor) {
        this.cor = cor;
        return this;
    }

    public String getModelo() {
        return modelo;
    }

    public Veiculo setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
