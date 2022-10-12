package agenda.main;

import java.util.Date;

import agenda.dao.ContatoDAO;
import agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		ContatoDAO contatoDAO = new ContatoDAO();
		
		contato.setNome("Marcos Lira");
		contato.setIdade(30);
		contato.setDataCadastro(new Date());
		// Salvar nosso contato
		//contatoDAO.criarContato(contato);
		
		//Atualizar nosso contato
		Contato c1 = new Contato();
		c1.setNome("Jonathan Henrique");
		c1.setIdade(28);
		c1.setDataCadastro(new Date());
		c1.setId(1);
		contatoDAO.atualizaContato(c1);
		
		//Deleção por ID
		contatoDAO.removerContato(1);
		
		//Visualização dos registros do banco de dados TODOS
		for(Contato c: contatoDAO.listarTodosContatos()) {
			System.out.println("Nome: "+c.getNome());
			System.out.println("Idade: "+c.getIdade());
		}
	}

}
