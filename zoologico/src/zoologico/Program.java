package zoologico; 

public class Program {
    public static void main(String[] args) {
        Zoologico animal = new Zoologico("cachorro", 4, 0.3f, "casa", 10.0f);
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Patas: " + animal.getPatas());
        System.out.println("Comprimento: " + animal.getComprimento());
        System.out.println("Ambiente: " + animal.getAmbiente());
        System.out.println("Velocidade media: " + animal.getVelocidadeMedia());
    }
}

 class Zoologico {

static Zoologico animal;
	String nome;
	public int patas;
	float comprimento;
	String cor;
	String ambiente;
	float velocidadeMedia;
		
	public  Zoologico(String  	nome, int patas, float comprimento, String ambiente, float velocidadeMedia) {
		this.nome=nome;
		this.patas=patas;
		this.comprimento=comprimento;
		this.ambiente=ambiente;
		this.velocidadeMedia=velocidadeMedia;
	}
	
	

	public  String getNome () {
		return nome;
	}
	
	public  int getPatas() {
		return patas;
	}
	
	public float getComprimento() {
		
		return comprimento;
	}



	public  String getCor() {
		return cor;
	}
	public  String getAmbiente() {
		return ambiente;
	}
	public  float getVelocidadeMedia() {
		return velocidadeMedia;
	}
}


