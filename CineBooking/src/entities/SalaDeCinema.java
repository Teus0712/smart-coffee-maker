package entities;

import java.util.List;
import java.util.ArrayList;

public class SalaDeCinema {
    private List<String> assentos = new ArrayList<>();
    private int totalAssentos;

    public SalaDeCinema(int totalAssentos) {
        this.totalAssentos = totalAssentos;
        for (int i = 0; i < totalAssentos; i++) {
            assentos.add("LIVRE");
        }
    }

    public void exibirMapa() {
        System.out.println("\n========= TELA DO CINEMA =========");
        for (int i = 0; i < totalAssentos; i++) {
            if (assentos.get(i).equals("LIVRE")) {
                System.out.println(i + " [✅] LIVRE");
            } else {
                System.out.println(i + " [❌] " + assentos.get(i));
            }
        }
        System.out.println("==================================\n");
    }

    public void reservar(int posicao, String nomeCliente) {
        if (posicao < 0 || posicao >= totalAssentos) {
            System.out.println("[ERRO]: Posição inválida!");
        } else if (assentos.get(posicao).equals("LIVRE")) {
            assentos.set(posicao, nomeCliente);
            System.out.println("[SISTEMA]: Reserva confirmada para " + nomeCliente + "!");
        } else {
            System.out.println("[AVISO]: Assento já ocupado!");
        }
    }

    public void cancelarReserva(int posicao) {
        if (posicao < 0 || posicao >= totalAssentos) {
            System.out.println("[ERRO]: Posição inválida!");
        } else {
            assentos.set(posicao, "LIVRE");
            System.out.println("[SISTEMA]: O assento " + posicao + " foi liberado com sucesso.");
        }
    }
}