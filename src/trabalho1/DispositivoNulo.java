package trabalho1;
// Null Object Pattern
public class DispositivoNulo extends Dispositivo {

	public DispositivoNulo() {
		this.modoOperacao = new ModoNulo();
		this.estado = new EstadoDesligado(this);
	}

	@Override
	public void ligarDesligar() {
		System.out.println("Nenhum dispositivo disponível.");
	}
}
