package livros;
import livros.Usuario.locatario;


public class Livro {
	String libro;
	String categoria;
	 int quantidade;
		
		public void libro(String libro, String categoria, int quantidade){
			this.libro = libro;
			this.categoria = categoria;
			this.quantidade = quantidade;
		}
	
		public String getlibro() {
			return libro;
			}
		public String getcategoria() {
			return categoria;
			}
		public int getquantidade() {
			return quantidade;
			}
		
}


