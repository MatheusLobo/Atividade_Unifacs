package livros;

public class Usuario {

	public class locatario{
		private String nome;
		private String CPF;
		private int livros;
		
		public locatario (String nome, String CPF, int livros) {
			this.nome = nome;
			this.CPF = CPF;
			this.livros = livros;
		}
		
		public String getNome() {
			return nome;
		}
		public String getCPF() {
			return CPF;
		}
		public int getlivros() {
			//System.out.println("Somente se o usario possuir livros alugados,");
			//System.out.println("O padrao é 0");
			return livros;
		}


	}
}
