package trabalho1;

public abstract class Estado {
	
	private Dispositivo dispositivo;
	
    public Estado(Dispositivo dispositivo) {
		super();
		this.dispositivo = dispositivo;
	}

	public abstract void ligar();
    
    public abstract void desligar();
    
    public abstract void economizarEnergia();
    

	public Dispositivo getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}
}
