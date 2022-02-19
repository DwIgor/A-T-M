import java.util.ArrayList;

public class Conta extends Pessoa {

	private String tipoDeConta = new String();
	private String senha = new String();
	private int idConta;
	private double saldoDaConta;
	private boolean contaEstaAtiva;
	private ArrayList<Double> extrato = new ArrayList<Double>();
	
	

	public ArrayList<Double> getExtrato() {
		return extrato;
	}

	public void setExtrato(double valor) {
		this.extrato.add(valor);
	}

	public Conta() {
		this.tipoDeConta = "Inativa";
		this.idConta = 0;
		this.saldoDaConta = 0.0;
		this.contaEstaAtiva = false;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String i) {
		this.senha = i;
	}

	public String getTipoDeConta() {
		return tipoDeConta;
	}

	public void setTipoDeConta(String tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public double getSaldoDaConta() {
		return saldoDaConta;
	}

	public void setSaldoDaConta(double saldoDaConta) {
		this.saldoDaConta = saldoDaConta;
	}

	public boolean getContaEstaAtiva() {
		return contaEstaAtiva;
	}

	public void setContaEstaAtiva(boolean contaEstaAtiva) {
		this.contaEstaAtiva = contaEstaAtiva;
	}

	public void status() {
		System.out.printf("Cliente: %s\n", this.getPrimeiroNome());
		System.out.printf("Data De Nascimento: %d/%d/%d\n", this.getDiaDeNascimento(), this.getMesDeNascimento(),
				this.getAnoDeNascimento());
		System.out.printf("Telefone: %s\n", this.getTelefone());
		System.out.printf("Tipo da conta: %s\n", this.getIdConta());
		System.out.printf("Id da Conta: %d\n", this.getIdConta());
		System.out.printf("Saldo Da Conta: %f\n", this.getSaldoDaConta());
		System.out.printf("Estado da conta: %b\n", this.getContaEstaAtiva());
		System.out.printf("==============================================\n");
	}

}
