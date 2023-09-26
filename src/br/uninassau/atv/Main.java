package br.uninassau.atv;

public class Main {

	public static void main(String[] args) {
		
		Secretaria secretaria = new Secretaria("Julia",1320,"12358105" );
		Gerente gerente = new Gerente("joao marcos" , 4500, "joao123", "joaoeseufilho");
		Telefonista telefonista = new Telefonista("Janaina", 1320, "5546138");
		
		System.out.println("SECRETARIA: ");
		
		System.out.println( secretaria.getNome() +  "\n" + secretaria.getSalario() + "\n" + secretaria.getNumeroRamal());
		System.out.println("\n");
		
		System.out.println("Gerente: ");
		System.out.println( gerente.getNome() +  "\n" + gerente.getSalario() + "\n" + gerente.getLogin() + "\n" + gerente.getSennha());
		
		System.out.println("\n");
		System.out.println("Telefonista: ");
		
		System.out.println( telefonista.getNome() +  "\n" + telefonista.getSalario() + "\n" + telefonista.getCodigo());
	}

}
