package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorRotas {

	private ArrayList<Rota> rotas;

	public GerenciadorRotas() {
		rotas = new ArrayList<>();
	}

	public void adicionar(Rota rota) {
		rotas.add(rota);
	}

	public ArrayList<Rota> listarTodas() {
		ArrayList<Rota> nova = new ArrayList<>();

		for (Rota r : rotas) {
			nova.add(r);
		}
		return nova;
	}

	public Rota buscarPorOrigem(Aeroporto aero) {
		for (Rota r : rotas) {
			if (aero.equals(r.getOrigem())) {
				return r;
			}
		}
		return null;
	}

}
