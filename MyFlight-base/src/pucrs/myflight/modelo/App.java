package pucrs.myflight.modelo;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		CiaAerea gol = new CiaAerea("G3", "Gol linhas areas sa");
		CiaAerea latam = new CiaAerea("JJ", "Latam linhas areas");

		GerenciadorCias gerCias = new GerenciadorCias();
		gerCias.adicionar(gol);
		gerCias.adicionar(latam);

		ArrayList<CiaAerea> todas = gerCias.listarTodas();

		for (CiaAerea c : todas) {
			System.out.println(c.getCodigo() + " - " + c.getNome());
		}

		// testando a busca por codigo

		CiaAerea aux = gerCias.buscarCodigo("JdJ");
		if (aux != null) {
			System.out.println("Achei " + aux.getCodigo() + " - " + aux.getNome());
		} else {
			System.out.println("Não encontrado.");
		}

	}

}
