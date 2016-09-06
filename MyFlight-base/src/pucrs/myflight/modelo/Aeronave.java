package pucrs.myflight.modelo;

public class Aeronave implements Imprimivel, Contavel, Comparable<Aeronave> {
	private String codigo;
	private String descricao;
	private static int totalAeronaves = 0;
	
	public Aeronave(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
		totalAeronaves++;
	}
	
	@Override
	public int totalAeronaves() {
		return totalAeronaves;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	@Override
	public void imprimir() {
		
		System.out.println(codigo + " - " + descricao);
		
	}

	@Override
	public int compareTo(Aeronave o) {
		// TODO Auto-generated method stub
		return codigo.compareTo(o.codigo);
	}
}
