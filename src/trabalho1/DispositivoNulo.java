package trabalho1;
// Null Object Pattern
public class DispositivoNulo extends Dispositivo {
	
	private String nome;
	// TODO condicionamento para  ligar e desligar quando um dispositivo tiver um nome
	@Override
	public void ligarDesligar() {
		System.out.println("Nenhum dispositivo disponível.");
	}
}
