package trabalho1;

import java.util.HashMap;
import java.util.Map;

public class ControleCasaInteligente {
	
	private Map<String, Dispositivo> dispositivos = new HashMap<>();

    public void adicionarDispositivo(String nome, Dispositivo dispositivo) {
        dispositivos.put(nome, dispositivo);
    }
    
    public void adicionarDispositivoGenerico(String nome) {
        dispositivos.put(nome, new DispositivoGenerico(nome));
    }

    public void removerDispositivo(String nome) {
        dispositivos.remove(nome);
    }

    public Dispositivo obterDispositivo(String nome) {
        return dispositivos.getOrDefault(nome, new DispositivoNulo());
    }
}
