package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooEscalas extends Voo{
	
	private ArrayList<Rota> rotas;
	
	public VooEscalas(LocalDateTime datahora){
		super(datahora); // chama o construtor de Voo
		rotas = new ArrayList<>();
	}
	
	public Rota getRotaFinal() {
		return null;
		//retornar primeira rota da lista
		
	}
	
	@Override
	public Duration getDuracao() {
		// calcular duracao em funcao da distancia
		return null;
	}

	
	@Override
	public String toString(){
		return super.toString();// + ", "+rotaFinal;
	}

	@Override
	public Rota getRota() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
