package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		System.out.println("Total de cias: "+CiaAerea.getTotalCias());
		
		CiaAerea gol = new CiaAerea("G3", "Gol linhas areas sa");
		System.out.println("Total de cias: "+CiaAerea.getTotalCias());
		CiaAerea latam = new CiaAerea("JJ", "Latam linhas areas");
		System.out.println("Total de cias: "+CiaAerea.getTotalCias());
		CiaAerea tap = new CiaAerea("TP", "TAP Portugal linhas aereas");
		System.out.println("Total de cias: "+CiaAerea.getTotalCias());
		
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
			System.out.println("\nEncontrado " + aux.getCodigo() + " - " + aux.getNome() + "\n");
		} else {
			System.out.println("Não encontrado.");
		}

		// teste Aeronaves

		Aeronave boeing1 = new Aeronave("733", "Boeing 737-300");
		Aeronave boeing2 = new Aeronave("73G", "Boeing 737-700");
		Aeronave airbus1 = new Aeronave("380", "Airbus industrie A380");

		GerenciadorAeronaves gerAeronaves = new GerenciadorAeronaves();

		gerAeronaves.adicionar(boeing1);
		gerAeronaves.adicionar(boeing2);
		gerAeronaves.adicionar(airbus1);

		ArrayList<Aeronave> todasAeronaves = gerAeronaves.listarTodas();

		for (Aeronave a : todasAeronaves) {
			System.out.println(a.getCodigo() + " - " + a.getDescricao());
		}

		// teste busca aeronave

		Aeronave auxAero = gerAeronaves.buscarPorCodigo("733");
		if (auxAero != null) {
			System.out.println("\nEncontrado : " + auxAero.getCodigo() + " - " + auxAero.getDescricao() + "\n");
		} else {
			System.out.println("Não encontrado");
		}

		// Geo LocPoa = new Geo(-29.9939, -51.1711);
		Aeroporto poa = new Aeroporto("POA", "Salgado Filho Intl Apt", new Geo(-23.4356, -46.4731));
		Aeroporto gru = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", new Geo(-23.4356, -46.4731));

		
		
		
		GerenciadorAeroportos gerAeroportos = new GerenciadorAeroportos();
		gerAeroportos.adicionar(poa);
		gerAeroportos.adicionar(gru);

		GerenciadorRotas gerRotas = new GerenciadorRotas();
		gerRotas.adicionar(new Rota(gol, gru, poa, gerAeronaves.buscarPorCodigo("73G")));
		gerRotas.adicionar(new Rota(gol , poa, gru, gerAeronaves.buscarPorCodigo("380")));
		
		
		
		ArrayList<Rota> rotas = gerRotas.listarTodas();
		GerenciadorVoos gerVoos = new GerenciadorVoos();
		
		
		// Vôo com duração de 1h30min GRU->POA
		LocalDateTime datahora1 = LocalDateTime.of(2016, 8, 18, 8, 30);
		Duration duracao1 = Duration.ofMinutes(90);
		// Rota: GRU -> POA
		Rota rota1 = rotas.get(0);
		Voo voo1 = new Voo(rota1, datahora1, duracao1);
		Voo voo2 = new Voo(rota1, duracao1);
		gerVoos.adicionar(voo1);
		gerVoos.adicionar(voo2);
		
		// Teste: procurar o vôo
		ArrayList<Voo> meusVoos = gerVoos.buscarData(LocalDate.of(2016, 8, 18));
		
		for(Voo v : meusVoos){
			System.out.println(v.getRota().getOrigem().getNome());
			System.out.println(v.getRota().getDestino().getNome());
			System.out.println(v.getDatahora());
		}
		
		Geo geo1  = new Geo(-23.4356, -46.4731);
		Geo geo2 = new Geo(-23.4356, -46.4731);
		
		
		System.out.println("Resultado distancia: "+ Geo.distancia(geo1, geo2));
		
	}

}
