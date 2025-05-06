package model;

public class Diagnostico {
    private Animal animal;
    private String descricao;

    public Diagnostico(Animal animal, String descricao) {
        this.animal = animal;
        this.descricao = descricao;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
