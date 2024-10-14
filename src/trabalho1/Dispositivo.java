package trabalho1;
// Classe Dispositivo Abstrata com Hook Methods
public abstract class Dispositivo {
	
	protected ModoOperacao modoOperacao;
	protected Estado estado;
	
	public Dispositivo() {
		this.modoOperacao = new ModoNulo();
		this.estado = new EstadoDesligado(this);
	}
	
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
        preLigarDesligar();
        getEstado().ligarDesligar();
        posLigarDesligar();
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
    protected void preLigarDesligar() {}
    protected void posLigarDesligar() {}
}
