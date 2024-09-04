package atividadesPOO3;

public class Conta {
	int id;
	String tipo;
	double saldo;
	String sacar;
	String depositar;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo (String tipo) {
		this.tipo = tipo;
	}
	public String getSacar() {
		return sacar;
	}
	public void setSacar (String sacar) {
		this.sacar = sacar;
	}
	public String getDepositar() {
		return depositar;
	}
	public void setDepositar (String depositar) {
		this.depositar = depositar;
	}
	public Double getSaldo(){
		return saldo;
	}
	public void setSaldo (Double saldo) {
		this.saldo = saldo;
	}
	public int getId() {
		return id;
	}
	public void setId (int id) {
		this.id = id;
	}
}