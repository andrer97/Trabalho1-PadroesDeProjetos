package trabalho1;
// Classe Concreta de um Dispositivo
public class DispositivoArCondicionado extends Dispositivo {
	
	public DispositivoArCondicionado() {
		this.modoOperacao = null;
		this.estado = new EstadoDesligado(this);
	}

	public void ajustarTemperatura(int temperatura) {
		System.out.println("Temperatura ajustada para: " + temperatura + " graus.");
	}
}
