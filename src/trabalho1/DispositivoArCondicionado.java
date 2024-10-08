package trabalho1;
// Classe Concreta de um Dispositivo
public class DispositivoArCondicionado extends Dispositivo {
	
	public DispositivoArCondicionado() {
		this.modoOperacao = new ModoNormal();
	}
	
	@Override
	public void ligar() {
		System.out.println("Ar Condicionado ligado.");
	}
	
	@Override
	public void desligar() {
		System.out.println("Ar Condicionado desligado.");
	}
	
	public void ajustarTemperatura(int temperatura) {
		System.out.println("Temperatura ajustada para: " + temperatura + " graus.");
	}
}
