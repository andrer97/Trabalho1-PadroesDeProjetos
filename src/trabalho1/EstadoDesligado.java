package trabalho1;

public class EstadoDesligado extends Estado {
	
    public EstadoDesligado(Dispositivo dispositivo) {
		super(dispositivo);
	}

	@Override
    public void ligarDesligar() {
        System.out.println("Ligando o dispositivo...");
        dispositivo.setEstado(new EstadoLigado(dispositivo));
        dispositivo.alterarModo(new ModoNormal());
    }
}
