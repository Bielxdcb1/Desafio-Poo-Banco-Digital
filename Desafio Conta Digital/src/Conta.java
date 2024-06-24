public abstract class Conta implements IConta{
	
	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	protected Cliente cliente;
		
	public Conta(Cliente cliente) {
		this.agencia= AGENCIA_PADRAO;
		this.numero= SEQUENCIAL++;
		this.cliente = cliente;

}

}