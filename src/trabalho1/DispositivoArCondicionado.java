package trabalho1;
// Classe Concreta de um Dispositivo
public class DispositivoArCondicionado extends Dispositivo {

    @Override
    protected void preLigarDesligar() {
        System.out.println("Verificando temperatura antes de ligar/desligar.");
    }
    
    @Override
    protected void posLigarDesligar() {
        System.out.println("Ajustando o modo do ar condicionado.");
    }
	
	public void ajustarTemperatura(int temperatura) {
		System.out.println("Temperatura ajustada para: " + temperatura + " graus.");
	}
}
