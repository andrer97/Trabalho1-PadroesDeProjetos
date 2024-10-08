package trabalho1;
// Null Object Pattern
public class DispositivoNulo extends Dispositivo {
	
	@Override
	public void ligar() {
		System.out.println("Nenhum dispositivo disponível.");
	}
	
	@Override
	public void desligar() {
		System.out.println("Nenhum dispositivo disponível.");
	}
}
