package com.kleber.javabasico.aula36;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setNome("Joseph");
		//contato.setEndereco("Rua São Paulo");
		//contato.setTelefone("11 99999-9999");
		
		//relacionamento tem-um endereco
		Endereco end = new Endereco();
		end.setNomeRua("Rua São Paulo 2");
		end.setNumero("S/N");
		end.setCidade("São Paulo");
		end.setEstado("SP");
		end.setCep("99999-999");
		
		contato.setEndereco(end);
		
		//relacionamento tem-um telefone
		Telefone telefone = new Telefone();
		telefone.setTipo("residencial");
		telefone.setDdd("11");
		telefone.setNumero("8888-8888");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("celular");
		telefone2.setDdd("11");
		telefone2.setNumero("99999-9999");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		//contato.setTelefone(telefone);
		contato.setTelefones(telefones);
		
		
		//Teste de saída no console
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone());
		
		if (contato != null && contato.getEndereco() != null){
			System.out.println(contato.getEndereco().getNomeRua());
		}
		/*if (contato != null && contato.getTelefone() != null){
			System.out.println(contato.getTelefone().getDdd() + 
					" " + contato.getTelefone().getNumero());
		}*/
		
		if (contato != null && contato.getTelefones() != null){
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + 
						" " + t.getNumero());
			}
		}
	}
}
