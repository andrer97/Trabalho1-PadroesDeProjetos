package trabalho1;

public class EstadoLigado extends Estado {
	
    public EstadoLigado(Dispositivo dispositivo) {
		super(dispositivo);
	}
    @Override
    public void ligarDesligar() {
        System.out.println("Desligando o dispositivo...");
        dispositivo.alterarModo(new ModoNulo());
        dispositivo.setEstado(new EstadoDesligado(dispositivo));
    }
}
