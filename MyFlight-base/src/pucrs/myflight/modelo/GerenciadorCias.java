package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;

	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	public void adicionar(CiaAerea cia) {
		empresas.add(cia);
	}

	public ArrayList<CiaAerea> listarTodas() {
		ArrayList<CiaAerea> nova = new ArrayList<>();

		for (CiaAerea c : empresas) {
			nova.add(c);
		}

		return nova;
	}

	public CiaAerea buscarCodigo(String codigo) {
		for (CiaAerea c : empresas) {
			if (codigo.equals(c.getCodigo())) {
				return c;
			}
		}
		return null; // não achou
	}

	public CiaAerea buscarNome(String nome) {
		for (CiaAerea c : empresas) {
			if (nome.equals(c.getNome())) {
				return c;
			}
		}
		return null; // não achou
	}

}