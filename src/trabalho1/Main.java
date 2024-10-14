package trabalho1;

public class Main {

	public static void main(String[] args) {

		// Instanciando o controle da casa inteligente
        ControleCasaInteligente controle = new ControleCasaInteligente();

        // Adicionando dispositivos reais
        Dispositivo arCondicionado = new DispositivoArCondicionado();
        controle.adicionarDispositivo("ArCondicionado", arCondicionado);

        // Tentando ligar e desligar o ar condicionado
        System.out.println("---- Operando Ar Condicionado ----");
        arCondicionado.ligarDesligar(); // Liga o ar condicionado
        arCondicionado.alterarModo(new ModoTurbo()); // Altera para modo Turbo
        arCondicionado.executarModo(); // Executa o modo Turbo
        arCondicionado.ligarDesligar(); // Desliga o ar condicionado

        // Tentando operar um dispositivo que não existe
        System.out.println("\n---- Operando Dispositivo Inexistente ----");
        Dispositivo dispositivoDesconhecido = controle.obterDispositivo("AspiradorDePo");
        dispositivoDesconhecido.ligarDesligar(); // Deverá retornar a resposta do objeto nulo
        dispositivoDesconhecido.executarModo(); // Também será um modo nulo

        // Adicionando um dispositivo genérico
        System.out.println("\n---- Adicionando Dispositivo Genérico ----");
        controle.adicionarDispositivoGenerico("Ventilador");
        Dispositivo ventilador = controle.obterDispositivo("Ventilador");
        ventilador.ligarDesligar(); // Dispositivo genérico
        ventilador.alterarModo(new ModoEconomia()); // Modo economia no dispositivo genérico
        ventilador.executarModo(); // Executando o modo economia

        // Removendo dispositivo
        System.out.println("\n---- Removendo Dispositivo ----");
        controle.removerDispositivo("Ventilador");
        ventilador = controle.obterDispositivo("Ventilador");
        ventilador.ligarDesligar(); // Será um dispositivo nulo
		}
}
