package biblioteca_Unifacs_A3;

import java.util.ArrayList;

public class Cadastro_Usuario {
		String nome;
		String cpf;
		String email;
		String endereco;
		String data_nasc;
		String telefone;
		ArrayList<Cadastro_Usuario> usuariosCadastrados = new ArrayList<Cadastro_Usuario>();
		public Cadastro_Usuario(String nome, String cpf, String email, String endereco, String data_nasc, String telefone) {
	        this.nome = nome;
	        this.cpf = cpf;
	        this.email = email;
	        this.endereco = endereco;
	        this.data_nasc = data_nasc;
	        this.telefone = telefone;
	    }

	    public void cadastrarUsuario(Cadastro_Usuario usuario) {
	        usuariosCadastrados.add(usuario);
	    }

	    public String getNome() {
	        return nome;
	    }

	    public String getCpf() {
	        return cpf;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getEndereco() {
	        return endereco;
	    }

	    public String getData_nasc() {
	        return data_nasc;
	    }

	    public String getTelefone() {
	        return telefone;
	    }
	}
