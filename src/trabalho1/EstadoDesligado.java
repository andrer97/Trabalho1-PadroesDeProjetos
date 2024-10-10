package trabalho1;

public class EstadoDesligado extends Estado {
	
    public EstadoDesligado(Dispositivo dispositivo) {
		super(dispositivo);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void ligar() {
        System.out.println("Ligando o dispositivo...");
        dispositivo.setEstado(new EstadoLigado());
    }

    @Override
    public void desligar() {
        System.out.println("O dispositivo já está desligado.");
    }

    @Override
    public void economizarEnergia() {
        System.out.println("Não é possível mudar para economia, o dispositivo está desligado.");
    }
}
