package model;

import utils.Especie;

public class Animal {
    private int id;
    private String nome;
    private int idade;
    private Especie especie;

    public Animal(int id, String nome, int idade, Especie especie) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
}
