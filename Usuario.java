package atividadesPOO3;

public class Usuario {
	int id, password;
	String nome, permissao, usuario;
	String fazLogin, pesquisa, colocaSenha, cadastra;
	
	public String getNome() {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId (int id) {
		this.id = id;
	}
	public int getPassword() {
		return password;
	}
	public void setPassWord (int password) {
		this.password = password;
	}
	public String getPermissao() {
		return permissao;
	}
	public void setPermissao (String permissao) {
		this.permissao = permissao;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario (String usuario) {
		this.usuario = usuario;
	}
	public String getFazLogin() {
		return fazLogin;
	}
	public void setFazLogin (String fazLogin) {
		this.fazLogin = fazLogin;
	}
	public String getPesquisa() {
		return pesquisa;
	}
	public void setPesquisa (String pesquisa) {
		this.pesquisa = pesquisa;
	}
	public String getColocaSenha() {
		return colocaSenha;
	}
	public void setColocaSenha (String colocaSenha) {
		this.colocaSenha = colocaSenha;
	}
	public String getCadastra() {
		return cadastra;
	}
	public void setCadastra (String cadastra) {
		this.cadastra = cadastra;
	}
}
