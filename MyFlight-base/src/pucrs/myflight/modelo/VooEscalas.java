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
	
	public void adicionarRota(Rota r){
		rotas.add(r);
	}
	
	
	public ArrayList<Rota> getRotas(){
		return (ArrayList<Rota>) rotas.clone();
	}
	
	
	
	@Override
	public Duration getDuracao() {
		// calcular duracao em funcao da distancia
		return null;
	}

	
	@Override
	public String toString(){
		return super.toString();
	}

	@Override
	public Rota getRota() {
		// retornar a primeira roda da lista
		return null;
	}
	
	

}
