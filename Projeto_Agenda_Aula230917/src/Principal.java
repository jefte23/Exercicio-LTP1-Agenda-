import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		// Inicia banco de dados
		BDSimulado bds = new BDSimulado();

		// Recupera lista de contatos e empresas

		// bds.addConexaoContato("João", "Email", "João@gmail.com");
		// bds.addConexaoContato("Mario", "Celular", "89578457");
		// bds.addConexaoContato("Erivelton", "Residencial", "33358455");
		// bds.addConexaoContato("Capgemini", "Email",
		// "atendimento@Capgemini.com");
		// bds.addConexaoContato("Raquel", "Residencial", "35848757");
		// bds.addConexaoContato("Banco do Brasil", "Email",
		// "atencimento@bb.com.br");
		// bds.addConexaoContato("Raquel", "Email", "Raquel@gmail.com");
		// bds.addConexaoContato("Capgemini", "Residencial", "35848757");
		// bds.addConexaoContato("Banco do Brasil", "Celular", "99669987");
		// bds.addConexaoContato("CAST", "Residencial", "35848757");
		// bds.addConexaoContato("Banco do Brasil", "Residencial", "33545845");
		// bds.addConexaoContato("Mario", "Residdencial", "35848757");
		// bds.addConexaoContato("Larine", "Celular", "89578457");
		// bds.addConexaoContato("Eron", "Celular", "99857585");
		// bds.addConexaoContato("Junior", "Email", "junior@Capgemni.com");
		// bds.addConexaoContato("Pedro", "Email", "Pedro@uol.com.br");

		// Questão 3
		System.out.println("---------------- Questão 3 ----------------");
		ArrayList<Contato> contatos = bds.getDadosContatos();
		for (int i = 0; i < contatos.size(); i++) {
			System.out.println(contatos.get(i).toString());
		}
		System.out.println("\n");

		// Questão 4
		System.out.println("---------------- Questão 4 ----------------");
		ArrayList<Contato> contatoPorUF = bds.getContatosUF("PE");
		for (int i = 0; i < contatoPorUF.size(); i++) {
			System.out.println(contatoPorUF.get(i));
		}
		System.out.println("\n");

		// Questão 5
		System.out.println("---------------- Questão 5 ----------------");
		ArrayList<Contato> contatoPorLetra = bds.getContatoLetra("J");
		for (int i = 0; i < contatoPorLetra.size(); i++) {
			System.out.println(contatoPorLetra.get(i));

		}
		System.out.println("\n");

		// Questão 6
		System.out.println("---------------- Questão 6 ----------------");
		ArrayList<Contato> mulherPorEmpresa = bds.getMulherPorEmpresa("Capgemini");
		for (int i = 0; i < mulherPorEmpresa.size(); i++) {
			System.out.println(mulherPorEmpresa.get(i));
		}
		System.out.println("\n");

		// Questão 7
		System.out.println("---------------- Questão 7 ----------------");
		ArrayList<Empresa> QtdPessoaEmpresa = bds.getQtdFuncEmpresa();
		for (int i = 0; i < QtdPessoaEmpresa.size(); i++) {
			System.out.println(QtdPessoaEmpresa.get(i).getNome() + ": "
					+ bds.contContatosEmpresa(QtdPessoaEmpresa.get(i).getNome()));

		}

		// <<< Questão Bonus >>>
		System.out.println("-------------- Questão Bonus --------------");

	}
}
