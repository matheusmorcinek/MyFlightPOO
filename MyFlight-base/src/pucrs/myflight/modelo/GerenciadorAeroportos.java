package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeroportos {

	private ArrayList<Aeroporto> aeroportos;
	
	public GerenciadorAeroportos(){
		aeroportos = new ArrayList<>();
	}
	
	public void adicionar(Aeroporto aero){
		aeroportos.add(aero);
	}
	
	public ArrayList<Aeroporto> listarTodos(){
		ArrayList<Aeroporto> nova = new ArrayList<>();
		
		for(Aeroporto a : aeroportos){
			nova.add(a);
		}
		
		return nova;
	}
	
	public Aeroporto buscarPorCodigo(String cod){
		for(Aeroporto a : aeroportos){
			if(cod.equals(a.getCodigo())){
				return a;
			}
		}
		return null;
	}
	
	
}
