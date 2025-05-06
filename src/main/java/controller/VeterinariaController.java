package controller;

import model.Animal;
import model.Diagnostico;
import utils.Especie;
import view.VeterinariaView;

import java.util.ArrayList;
import java.util.List;


public class VeterinariaController {
    private VeterinariaView view;
    private Animal animalModel;
    private Diagnostico diagnoticoModel;
    private List<Animal> animaisCadastrados = new ArrayList<>();
    private List<Diagnostico> diagnosticosCadastrados = new ArrayList<>();

    public VeterinariaController(VeterinariaView view) {
        this.view = view;
    }

    public void cadastrarAnimal(){
        int id = view.solicitacaoInt("Digite o id do animal: ");
        String nome = view.solicitacaoString("Digite o nome do animal: ");
        int idade = view.solicitacaoInt("Digite a idade do animal: ");
        Especie especie = view.solicitarEspecie();

        animalModel = new Animal(id, nome, idade, especie);
        animaisCadastrados.add(animalModel);

        view.mostrarMensagem("\n");
        view.mostrarMensagem("Animal cadastrado com sucesso!");

        view.mostrarMensagem("ID: " + animalModel.getId());
        view.mostrarMensagem("Nome: " + animalModel.getNome());
        view.mostrarMensagem("Idade: " + animalModel.getIdade());
        view.mostrarMensagem("Espécie: " + animalModel.getEspecie());
        view.mostrarMensagem("\n");
    }

    public void listarAnimais(){
        view.mostrarMensagem("************* Animais *************");
        for(Animal animal : animaisCadastrados){
            view.mostrarMensagem(" ");
            view.mostrarMensagem("Nome: " + animal.getNome());
            view.mostrarMensagem("Idade: " + animal.getIdade());
            view.mostrarMensagem("Espécie: " + animal.getEspecie());
        }
    }

    public void cadastarDiagnostico(){
        boolean validID = false;
        boolean exit = false;
        int id;
        Animal animalDiagnoticado = null;

        while (!validID){
            id = view.solicitacaoInt("Digite o id do animal que deseja cadastrar: ");

            for(Animal animal : animaisCadastrados){
                if(id == animal.getId()) {
                    animalDiagnoticado = animal;
                    validID = true;
                }
            }

            if(animalDiagnoticado == null){
                view.mostrarMensagem("ID inválido !!");
            }

            String solicitacaoSaida = view.solicitacaoString("Deseja sair?(S/N)");

            if(solicitacaoSaida.equals("S")){
                validID = true;
                exit = true;
            }else if(solicitacaoSaida.equals("N")){
                view.mostrarMensagem("OK! Vou solicitar o id novamnete!");
            }else{
                view.mostrarMensagem("Opção inválida! Vou seguir solicitando novamente o ID.");
            }

        }

        if(exit){
            return;
        }

        String diagnostico = view.solicitacaoString("Digite o diagnostico do animal: ");

        diagnoticoModel = new Diagnostico(animalDiagnoticado, diagnostico);

        diagnosticosCadastrados.add(diagnoticoModel);

        view.mostrarMensagem("Diagnotico cadastrado com sucesso!");

        view.mostrarMensagem("Nome do animal: " + diagnoticoModel.getAnimal().getNome());
        view.mostrarMensagem("Idade: " + diagnoticoModel.getAnimal().getIdade());
        view.mostrarMensagem("Espécie: " + diagnoticoModel.getAnimal().getEspecie());
        view.mostrarMensagem("Diagnostico: " + diagnoticoModel.getDescricao());
    }

    public void listarDiagnosticos(){
        view.mostrarMensagem("************* Diagnosticos *************");
        for(Diagnostico diagnosticoAnimal : diagnosticosCadastrados){
            view.mostrarMensagem(" ");
            view.mostrarMensagem("Nome do animal: " + diagnosticoAnimal.getAnimal().getNome());
            view.mostrarMensagem("Idade do animal: " + diagnosticoAnimal.getAnimal().getIdade());
            view.mostrarMensagem("Espécie do animal: " + diagnosticoAnimal.getAnimal().getEspecie());
            view.mostrarMensagem("Diagnostico: " + diagnosticoAnimal.getDescricao());
        }
    }
}
