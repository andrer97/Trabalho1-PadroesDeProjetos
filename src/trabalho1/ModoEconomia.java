package trabalho1;
//Estratégias Concretas
public class ModoEconomia implements ModoOperacao {
	@Override
	public void executarModo() {
		System.out.println("Executando em Modo Economia de Energia.");
	}
}
