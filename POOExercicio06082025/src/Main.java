import model.Carro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Carro> carros = new ArrayList<Carro>();
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int op;

        do {
            System.out.println("***************************");
            System.out.println("***********MENU************");
            System.out.println("***************************");
            System.out.println("Opções:");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Resgatar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Listar todos");
            System.out.println("5 - Excluir um carro");
            System.out.println("6 - Sair");
            op = scan.nextInt();
            switch (op){
                case 1: {
                    cadastrarCarro();
                    break;
                }
                case 2: {
                    int id;
                    System.out.println("Informe o id do carro: ");
                    id = scan.nextInt();
                    System.out.println(procurarCarro(id));
                    break;
                }
                case 3: {
                    int id;
                    System.out.println("Informe o id do carro para alterar: ");
                    id = scan.nextInt();
                    Carro carro = procurarCarro(id);
                    System.out.println(carro);
                    alterarCarro(carro);
                    break;
                }
                case 4: {
                    listarTodos();
                    break;
                }
                case 5: {
                    int id;
                    System.out.println("Informe o id do carro para exclusão: ");
                    id = scan.nextInt();
                    Carro carro = procurarCarro(id);
                    excluirCarro(carro);
                    break;
                }
                case 6: {
                    System.out.println("Saindo do sistema...");
                    break;
                }
                default: {
                    System.out.println("Opção inválida... informar número de 1 a 6...");
                }
            }
        } while (op !=6);
    }
    public static void cadastrarCarro(){
        Carro carro = new Carro();
        System.out.println("Informe o id do carro: ");
        carro.setId(scan.nextInt());
        System.out.println("Informe a marca do carro: ");
        scan.nextLine();
        carro.setMarca(scan.nextLine());
        System.out.println("Informe o tipo do combustível do carro: ");
        carro.setCombustivel(scan.nextLine());
        System.out.println("Informe o ano de fabricação do carro:");
        carro.setAno(scan.nextInt());
        System.out.println("Informe o valor do carro:");
        carro.setPreco(scan.nextDouble());
        carros.add(carro);
    }
    public static Carro procurarCarro(int id){
        Carro carro = new Carro();
        for (Carro car : carros){
            if (car.getId() == id){
                carro = car;
                break;
            }
        }
        return carro;
    }
    public static void alterarCarro(Carro car){
        System.out.println("Informe a nova marca do carro: ");
        scan.nextLine();
        car.setMarca(scan.nextLine());
        System.out.println("Informe o novo tipo de combustível do carro: ");
        car.setCombustivel(scan.nextLine());
        System.out.println("Informe o novo valor do ano de fabricação do carro:");
        car.setAno(scan.nextInt());
        System.out.println("Informe o novo preço do carro:");
        car.setPreco(scan.nextDouble());
    }
    public static void listarTodos(){
        for(Carro carro : carros){
            System.out.println(carro);
            System.out.println("--------------------");
        }
    }
    public static void excluirCarro(Carro carro){
        for(Carro car : carros){
            if(car.getId()== carro.getId()){
                carros.remove(carro);
                break;
            }
        }
    }
}