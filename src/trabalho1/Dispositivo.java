package trabalho1;
// Classe Dispositivo Abstrata com Hook Methods
public abstract class Dispositivo {
	
	protected ModoOperacao modoOperacao;
	private Estado estado;
	
	public void alterarModo(ModoOperacao novoModo) {
		this.modoOperacao = novoModo;
	}
	
	public void executarModo() {
		if (modoOperacao != null) {
			modoOperacao.executarModo();
		}
	}
	
	public abstract void ligar();
	
	public abstract void desligar();

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
