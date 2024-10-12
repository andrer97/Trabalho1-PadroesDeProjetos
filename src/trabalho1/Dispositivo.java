package trabalho1;
// Classe Dispositivo Abstrata com Hook Methods
public abstract class Dispositivo {
	
	protected ModoOperacao modoOperacao;
	protected Estado estado;
	
	public ModoOperacao getModo() {
		return modoOperacao;
	}
	
	public void alterarModo(ModoOperacao novoModo) {
        if (estado instanceof EstadoLigado) {
            this.modoOperacao = novoModo;
        } else {
            System.out.println("Não é possível alterar o modo enquanto o dispositivo está desligado.");
        }
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
