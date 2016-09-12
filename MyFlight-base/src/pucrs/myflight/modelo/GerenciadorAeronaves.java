package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GerenciadorAeronaves {
	private ArrayList<Aeronave> aeronaves;

	public GerenciadorAeronaves() {
		aeronaves = new ArrayList<>();
	}

	public void adicionar(Aeronave aviao) {
		aeronaves.add(aviao);
	}

	public void ordenarAeronaves() {
		//ordena lista de aeronaves
		Collections.sort(aeronaves);
	
	}

	public void ordenarDescricao(){
		aeronaves.sort(Comparator.comparing(Aeronave::getDescricao));
	}
	
	public void ordenarCodigo(){
		aeronaves.sort(Comparator.comparing(Aeronave::getCodigo));
	}
	
	public ArrayList<Aeronave> listarTodas() {
		/*
		ArrayList<Aeronave> nova = new ArrayList<>();

		for (Aeronave a : aeronaves) {
			nova.add(a);
		}
		return nova;
		*/
		return new ArrayList<Aeronave>(aeronaves);
		
	}

	public Aeronave buscarPorCodigo(String cod) {
		for (Aeronave a : aeronaves) {
			if (cod.equals(a.getCodigo())) {
				return a;
			}
		}
		return null; //nao achou
	}

}
