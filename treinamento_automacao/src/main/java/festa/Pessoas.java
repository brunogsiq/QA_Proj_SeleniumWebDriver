package festa;

public class Pessoas
{
	private String nome;
	private String sobrenome;
	private String cpf;
	private String telefone;
	private String mesa;
	private String tipoConvidado;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getMesa() {
		return mesa;
	}
	public void setMesa(String mesa) {
		this.mesa = mesa;
	}
	public String getTipoConvidado() {
		return tipoConvidado;
	}
	public void setTipoConvidado(String tipoConvidado) {
		this.tipoConvidado = tipoConvidado;
	}

	public void TipoConvidado()
	{
        if (tipoConvidado != "Normal") {
            System.out.println("Padrinho - Direcionar para as mesas principais.");
        }
	}

}