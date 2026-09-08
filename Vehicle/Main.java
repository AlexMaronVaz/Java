import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int opcao = 1;

        Vehicle veiculo = null;
        String categoria = "";
        String classe = "";

        while(opcao != 0){

            System.out.println("\nMenu:\n");
            System.out.println("0: Sair");
            System.out.println("1: Novo veículo");
            System.out.println("2: Ver veículo");
            System.out.print("\nDigite uma opção: ");

            opcao = input.nextInt();

            int numPassageiros, tamTanque, mpg;
            int catVehicle, classVehicle, capCarga, altVeiculo;

            switch(opcao){
                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                case 1:
                    System.out.print("\nNúmero de passageiros: ");
                    numPassageiros = input.nextInt();

                    System.out.print("Tamanho do tanque: ");
                    tamTanque = input.nextInt();

                    System.out.print("MPG: ");
                    mpg = input.nextInt();

                    System.out.print("Qual a categoria do veículo (1-Carro | 2-Truck): ");
                    catVehicle = input.nextInt();

                    if(catVehicle == 1) {
                        categoria = "Carro";
                        classe = "";
                        veiculo = new Vehicle(numPassageiros, tamTanque, mpg);
                    } else if(catVehicle == 2) {
                        categoria = "Truck";

                        System.out.print("Capacidade de carga: ");
                        capCarga = input.nextInt();

                        System.out.print("Qual o tipo de terreno (1-Urbano | 2-Off-Road): ");
                        classVehicle = input.nextInt();

                        if(classVehicle == 1){
                            classe = "Urbano";
                            veiculo = new Truck(numPassageiros, tamTanque, mpg, capCarga);
                        } else if(classVehicle == 2){
                            classe = "Off-Road";

                            System.out.print("Altura do veículo (Ground Clearance): ");
                            altVeiculo = input.nextInt();

                            veiculo = new OffRoad(numPassageiros, tamTanque, mpg, capCarga, altVeiculo);
                        }
                    }
                    break;

                case 2:
                    if(veiculo != null) {
                        System.out.println("\n--- DADOS DO VEÍCULO ---");
                        System.out.println("Categoria: " + categoria);
                        if(!classe.isEmpty()){
                            System.out.println("Classe: " + classe);
                        }
                        System.out.println("Número de passageiros: " + veiculo.getPassangers());
                        System.out.println("Tamanho do tanque: " + veiculo.getFuelCap());
                        System.out.println("MPG: " + veiculo.getMpg());

                        if(veiculo instanceof Truck) {
                            Truck t = (Truck) veiculo;
                            System.out.println("Capacidade de Carga: " + t.getCargoCap());
                        }
                        if(veiculo instanceof OffRoad) {
                            OffRoad o = (OffRoad) veiculo;
                            System.out.println("Altura do Solo: " + o.getGroundClearance());
                        }
                    } else {
                        System.out.println("\nNenhum veículo cadastrado ainda.");
                    }
                    break;
            }
        }
        input.close();
    }
}
