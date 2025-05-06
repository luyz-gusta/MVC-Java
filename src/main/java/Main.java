import controller.VeterinariaController;
import view.VeterinariaView;

public class Main {
    public static void main(String[] args) {
        VeterinariaView view = new VeterinariaView();
        VeterinariaController controller = new VeterinariaController(view);
        int option = 5;

        System.out.println("**************** PetTech ****************");
        while (option > 4){
            option = view.solicitacaoInt("MENU: \n(1) Cadastrar animal\n(2) Listar animais" +
                    "\n(3) Cadastrar diagnostico \n(4) Listar diagnosticos\n(0) Sair/Encerrar");

            if(option == 1){
                controller.cadastrarAnimal();
            }else if(option == 2){
                controller.listarAnimais();
            }else if(option == 3){
                controller.cadastarDiagnostico();
            }else if(option == 4){
                controller.listarDiagnosticos();
            }else{
                view.mostrarMensagem("Opção inválida! Escolha novamente.");
            }

            option = 5;
        }
    }
}