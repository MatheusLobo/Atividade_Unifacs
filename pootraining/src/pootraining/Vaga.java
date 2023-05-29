package pootraining;

public class Vaga {
	private int numero;
	private boolean disponivel;
	
	public void vaga (int numero) {
		this.numero = numero;
		this.disponivel = true;
		
	}
	public int setNumero() {
		return numero;
}
	public boolean isDisponivel() {
		return disponivel ;
	}
	public void setDisponivel(boolean Disponivel) {
		this.disponivel = disponivel;
	}
}
