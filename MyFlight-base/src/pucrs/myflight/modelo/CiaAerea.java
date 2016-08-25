package pucrs.myflight.modelo;

public class CiaAerea {
	private String codigo;
	private String nome;
	private static int totalCias = 0;
	// atributo de classe static,

	public CiaAerea(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
		totalCias++;
	}

	public static int getTotalCias() {
		return totalCias;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
}
