package view;

import utils.Especie;

import java.util.Scanner;

public class VeterinariaView {
    public Scanner scanner;

    public VeterinariaView() {
        this.scanner = new Scanner(System.in);
    }

    public String solicitacaoString(String solicitacao){
        System.out.println(solicitacao);
        return scanner.nextLine();
    }

    public int solicitacaoInt(String solicitacao){
        System.out.println(solicitacao);
        return Integer.parseInt(scanner.nextLine());
    }

    public Especie solicitarEspecie(){
        System.out.println("Digite o nome da espécie: ");
        return Especie.valueOf(scanner.nextLine());
    }

    public void mostrarMensagem(String mensagem){
        System.out.println(mensagem);
    }
}
