package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooDireto extends Voo {
	
	private Rota rota;
	
	public VooDireto(LocalDateTime datahora, Rota rota) {
		super(datahora);
		this.rota = rota;
		
	}

	@Override
	public Rota getRota() {
		return rota;
	}

	@Override
	public Duration getDuracao() {
		// calcular duracao em funcao da distancia
		
		return null;
		
	}

	
	
	
	
}
