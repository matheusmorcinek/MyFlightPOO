package pucrs.myflight.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorVoos {

	private ArrayList<Voo> voos;

	public GerenciadorVoos() {
		voos = new ArrayList<>();
	}

	public void adicionar(Voo voo) {
		voos.add(voo);
	}

	public ArrayList<Voo> listarTodos() {
		ArrayList<Voo> nova = new ArrayList<>();

		for (Voo v : voos) {
			nova.add(v);
		}
		return nova;
	}

	public ArrayList<Voo> buscarData(LocalDateTime data) {
		ArrayList<Voo> nova = new ArrayList<>();

		for (Voo v : voos) {

			if (data.equals(v.getDatahora().toLocalDate())) {
				nova.add(v);
			}

		}
		return nova;
	}

}
