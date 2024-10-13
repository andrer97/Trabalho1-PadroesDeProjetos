package trabalho1;
// Classe Dispositivo Abstrata com Hook Methods
public abstract class Dispositivo {
	
	protected ModoOperacao modoOperacao;
	protected Estado estado;
	
	public void alterarModo(ModoOperacao novoModo) {
        if (estado instanceof EstadoLigado) {
            this.modoOperacao = novoModo;
        } else {
            System.out.println("Não foi possível alterar o modo do dispositivo.");
        }
	}
	
	public void executarModo() {
		if (!(modoOperacao instanceof ModoNulo)) {
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
