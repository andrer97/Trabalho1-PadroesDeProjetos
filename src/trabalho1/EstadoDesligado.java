package trabalho1;

public class EstadoDesligado implements Estado {
	
    @Override
    public void ligar(Dispositivo dispositivo) {
        System.out.println("Ligando o dispositivo...");
        dispositivo.setEstado(new EstadoLigado());
    }

    @Override
    public void desligar(Dispositivo dispositivo) {
        System.out.println("O dispositivo já está desligado.");
    }

    @Override
    public void economizarEnergia(Dispositivo dispositivo) {
        System.out.println("Não é possível mudar para economia, o dispositivo está desligado.");
    }
}
