package br.com.caelum.mapper.modelo;

public class Nome {

	private String primeiroNome;
	private String sobreNome;

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
