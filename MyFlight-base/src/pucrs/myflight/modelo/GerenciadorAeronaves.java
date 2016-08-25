package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.Collections;

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

	public ArrayList<Aeronave> listarTodas() {
		ArrayList<Aeronave> nova = new ArrayList<>();

		for (Aeronave a : aeronaves) {
			nova.add(a);
		}
		// return new ArrayList<Aeronave>(aeronaves);
		return nova;
	}

	public Aeronave buscarPorCodigo(String cod) {
		for (Aeronave a : aeronaves) {
			if (cod.equals(a.getCodigo())) {
				return a;
			}
		}
		return null;
	}

}
