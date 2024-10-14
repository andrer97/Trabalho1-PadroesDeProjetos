package trabalho1;
// Null Object Pattern
public class DispositivoNulo extends Dispositivo {

	@Override
	public void ligarDesligar() {
		System.out.println("Nenhum dispositivo disponível.");
	}
}
