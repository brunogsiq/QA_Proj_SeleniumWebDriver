package festa;

public class Main
{

	public static void main(String[] args) 
	{
		Pessoas convite1 = new Pessoas();
		convite1.setNome("Telma");
		convite1.setSobrenome("Siqueira");
		convite1.setCpf("123456789-12");
		convite1.setTelefone("48 99105 0000");
		convite1.setMesa("17");
		convite1.setTipoConvidado("Normal");
		
		System.out.println("Dados do convite: ");
		System.out.println("Nome: " + convite1.getNome());
		System.out.println("Sobrenome: " + convite1.getSobrenome());
		System.out.println("Cpf: " + convite1.getCpf());
		System.out.println("Telefone: " + convite1.getTelefone());
		System.out.println("Mesa: " + convite1.getMesa());
		
		System.out.println("\n");
		
		Pessoas convite2 = new Pessoas();
		convite2.setNome("Noeli");
		convite2.setSobrenome("Gonçalves");
		convite2.setCpf("987654321-10");
		convite2.setTelefone("48 99105 0001");
		convite2.setMesa("21");
		convite2.setTipoConvidado("Madrinha");
				
		System.out.println("Dados do convite: ");
		System.out.println("Nome: " + convite2.getNome());
		System.out.println("Sobrenome: " + convite2.getSobrenome());
		System.out.println("Cpf: " + convite2.getCpf());
		System.out.println("Telefone: " + convite2.getTelefone());
		System.out.println("Mesa: " + convite2.getMesa());
	}

}
