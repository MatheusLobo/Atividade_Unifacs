package pootraining;

import java.util.List;

public class Estacionamento {
	private List<carro> carros;
	private List<Vagas> vagas;
	
	public Estacionamento() {
		this.carros = new ArrayList<>();
		this.vagas = new ArrayList<>();
		
	}
	
	public void adicionarCarro(Carro carro) {
		this.carros.add(carro);
	}
	public void removerCarro(Carro carro) {
		this.carros.remove(carro);
		for (Vaga vaga : this.vagas) {
			if (vaga.getNumero()== carro.getNumeroVaga()) {
				vaga.setDisponivel(true);
				break;
			}
		}

	    public void adicionarVaga(Vaga vaga) {
	        this.vagas.add(vaga);
	    }

	    public void removerVaga(Vaga vaga) {
	        this.vagas.remove(vaga);
	    }

	    public void estacionarCarro(Carro carro, Vaga vaga) throws Exception {
	        if (!vaga.isDisponivel()) {
	            throw new Exception("Não há vagas disponíveis");
	        }
	        carro.setNumeroVaga(vaga.getNumero());
	        vaga.setDisponivel(false);
	        adicionarCarro(carro);
	    }
	}
}