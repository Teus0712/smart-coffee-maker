# 🎬 CineBooking System

O **CineBooking** é uma aplicação interativa via terminal desenvolvida em Java para gerenciar reservas de assentos em uma sala de cinema. O foco deste projeto foi a aplicação de coleções dinâmicas e a construção de uma interface de linha de comando (CLI) intuitiva.

## 🚀 Funcionalidades
- **Configuração de Sala**: Permite definir a quantidade de assentos disponíveis no início da execução.
- **Mapa de Assentos**: Visualização em tempo real do status de cada poltrona.
- **Reserva Inteligente**: Sistema de reserva que valida se o assento está disponível antes de confirmar.
- **Cancelamento**: Opção para liberar assentos ocupados, atualizando o status da sala instantaneamente.

## 🛠️ Conceitos Aplicados
- **Java Collections (`ArrayList`)**: Utilizado para gerenciar a lista de assentos e nomes dos clientes.
- **Tratamento de Input**: Uso da classe `Scanner` com limpeza de buffer para garantir entradas de dados sem erros.
- **Estruturas de Controle**: Lógica baseada em `while` e `switch-case` para manter o programa rodando até a ação do usuário.
- **Clean Code**: Separação clara entre a lógica de interface (`MainCinema`) e a lógica de negócio (`SalaDeCinema`).

## 💻 Como executar
1. Certifique-se de ter o JDK instalado.
2. Clone o repositório.
3. Navegue até a pasta `src`.
4. Compile e execute a classe `application.MainCinema`.