package br.uninassau.atv;

public class Gerente extends Funcionario {

	private String login;
	private String sennha;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSennha() {
		return sennha;
	}
	public void setSennha(String sennha) {
		this.sennha = sennha;
	}
	public Gerente(String nome, int salario, String login, String sennha) {
		super(nome, salario);
		this.login = login;
		this.sennha = sennha;
	}
	
	
	

	
	
	
	
	
	

}
