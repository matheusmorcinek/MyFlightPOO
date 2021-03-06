package pucrs.myflight.modelo;

import java.util.Comparator;

import java.time.LocalDate;

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
		return new ArrayList<Voo>(voos);
	}

	public ArrayList<Voo> buscarData(LocalDate data) {
		ArrayList<Voo> nova = new ArrayList<>();

		for (Voo v : voos) {

			if (data.equals(v.getDatahora().toLocalDate())) {
				nova.add(v);
			}

		}
		return nova;
	}

	public void ordenaDataHora() {
		voos.sort(Comparator.comparing(Voo::getDatahora));
	}

	public void ordenaDataHoraDuracao() {
		voos.sort(Comparator.comparing(Voo::getDatahora).thenComparing(Voo::getDuracao));
	}

}
