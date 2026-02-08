package application;

import java.util.Locale;
import java.util.Scanner;
import entities.SalaDeCinema;

public class MainCinema {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos assentos tem a sala hoje? ");
        int quantity = sc.nextInt();
        SalaDeCinema sala = new SalaDeCinema(quantity);

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("======= MENU CINEBOOKING =======");
            System.out.println(" 1. Ver Mapa");
            System.out.println(" 2. Reservar Assento");
            System.out.println(" 3. Cancelar Reserva");
            System.out.println(" 4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    sala.exibirMapa();
                    break;
                case 2:
                    System.out.print("Qual o número do assento? ");
                    int pos = sc.nextInt();
                    sc.nextLine(); 
                    
                    System.out.print("Qual o seu nome? ");
                    String nome = sc.nextLine();

                    sala.reservar(pos, nome);
                    break;
                
                case 3:
                    System.out.print("[AÇÃO] Informe o número do assento para CANCELAR: ");
                    pos = sc.nextInt();
                    sc.nextLine(); 

                    sala.cancelarReserva(pos);
                    break;
                
                case 4:
                    System.out.println("Saindo... Até a próxima sessão!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        sc.close();
    }
}