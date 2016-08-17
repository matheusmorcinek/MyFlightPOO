package pucrs.myflight.modelo;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		CiaAerea gol = new CiaAerea("G3", "Gol linhas areas sa");
		CiaAerea latam = new CiaAerea("JJ", "Latam linhas areas");
		CiaAerea tap = new CiaAerea("TP", "TAP Portugal linhas aereas");

		
		
		GerenciadorCias gerCias = new GerenciadorCias();
		gerCias.adicionar(gol);
		gerCias.adicionar(latam);
		gerCias.adicionar(tap);
		
		
		ArrayList<CiaAerea> todas = gerCias.listarTodas();

		for (CiaAerea c : todas) {
			System.out.println(c.getCodigo() + " - " + c.getNome());
		}

		
		// testando a busca por codigo

		CiaAerea aux = gerCias.buscarCodigo("JJ");
		if (aux != null) {
			System.out.println("\nEncontrado " + aux.getCodigo() + " - " + aux.getNome()+"\n");
		} else {
			System.out.println("Não encontrado.");
		}

		
		
		//teste  Aeronaves
		
		Aeronave boeing1 = new Aeronave("733", "Boeing 737-300");
		Aeronave boeing2 = new Aeronave("73G", "Boeing 737-700");
		Aeronave airbus1 = new Aeronave("380", "Airbus industrie A380");
		
		GerenciadorAeronaves gerAeronaves = new GerenciadorAeronaves();
		
		gerAeronaves.adicionar(boeing1);
		gerAeronaves.adicionar(boeing2);
		gerAeronaves.adicionar(airbus1);
		
		ArrayList<Aeronave> todasAeronaves = gerAeronaves.listarTodas();
		
		for(Aeronave a : todasAeronaves){
			System.out.println(a.getCodigo()+" - "+a.getDescricao());
		}
		
		
		//teste busca aeronave
		
		Aeronave auxAero = gerAeronaves.buscarPorCodigo("733");
		if(auxAero != null){
			System.out.println("\nEncontrado : "+auxAero.getCodigo()+ " - " + auxAero.getDescricao()+"\n");
		}else {
			System.out.println("Não encontrado");
		}
		
	}

}
