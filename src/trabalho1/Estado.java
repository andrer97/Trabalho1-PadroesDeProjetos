package trabalho1;

public abstract class Estado {
	
	protected Dispositivo dispositivo;
	
    public Estado(Dispositivo dispositivo) {
		super();
		this.dispositivo = dispositivo;
	}

	public abstract void ligarDesligar();

	public Dispositivo getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}
}
