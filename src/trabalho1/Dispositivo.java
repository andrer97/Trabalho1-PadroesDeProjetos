package trabalho1;
// Classe Dispositivo Abstrata com Hook Methods
public abstract class Dispositivo {
	
	protected ModoOperacao modoOperacao;
	protected Estado estado;
	
	public ModoOperacao getModo() {
		return modoOperacao;
	}
	
	public void alterarModo(ModoOperacao novoModo) {
		this.modoOperacao = novoModo;
	}
	
	public void executarModo() {
		if (modoOperacao != null) {
			modoOperacao.executarModo();
		}
	}
	
	public void ligarDesligar() {
		getEstado().ligarDesligar();
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
