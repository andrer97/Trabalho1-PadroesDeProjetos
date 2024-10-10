package trabalho1;

public class EstadoLigado extends Estado {
	
    public EstadoLigado(Dispositivo dispositivo) {
		super(dispositivo);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void ligar() {
        System.out.println("O dispositivo já está ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o dispositivo...");
        dispositivo.setEstado(new EstadoDesligado());
    }

    @Override
    public void economizarEnergia() {
        System.out.println("Mudando para o modo de economia de energia.");
        dispositivo.setEstado(new EstadoEconomiaEnergia());
    }
}
