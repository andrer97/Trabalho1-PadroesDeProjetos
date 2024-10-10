package trabalho1;

public class Main {

	public static void main(String[] args) {

		
		ControleCasaInteligente casa = new ControleCasaInteligente();
		Dispositivo d1 = new DispositivoArCondicionado();
		casa.adicionarDispositivo("ar", d1);
		System.out.println(casa.obterDispositivo("ar"));
		d1.executarModo();
		d1.alterarModo(new ModoTurbo());
		d1.executarModo();
		System.out.println(casa.obterDispositivo("teste"));
		casa.obterDispositivo("teste").ligar();
		d1.ligar();
	}

}
