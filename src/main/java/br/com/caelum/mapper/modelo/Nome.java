package br.com.caelum.mapper.modelo;

public class Nome {

	private String sobreNome;
	private String primeiroNome;

	public Nome(String primeiroNome, String sobreNome) {
		this.primeiroNome = primeiroNome;
		this.sobreNome = sobreNome;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public String getSobreNome() {
		return sobreNome;
	}


}
