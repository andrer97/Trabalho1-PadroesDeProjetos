package trabalho1;

public class EstadoLigado implements Estado {
	
    @Override
    public void ligar(Dispositivo dispositivo) {
        System.out.println("O dispositivo já está ligado.");
    }

    @Override
    public void desligar(Dispositivo dispositivo) {
        System.out.println("Desligando o dispositivo...");
        dispositivo.setEstado(new EstadoDesligado());
    }

    @Override
    public void economizarEnergia(Dispositivo dispositivo) {
        System.out.println("Mudando para o modo de economia de energia.");
        dispositivo.setEstado(new EstadoEconomiaEnergia());
    }
}
