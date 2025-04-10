public class Main {
	public static void main(String[] args) {
		int f = 0,op=99; //Controla o numero de funcionarios;Controla a opção
		Funcionario[] equipe = new Funcionario[10];
		do {
			System.out.printf("Digite a opção que deseja\n1 - Cadastro de funcionarios\n2 - Atualização Cadastral\n3 - Exclusão de cadastro\n4 - Exibir Funcionarios cadastrados\n0 - Sair");
			op = Teclado.lerInteiro("");
			switch(op) {
			case 1://Cadastro
				equipe[f] = new Funcionario();
				equipe[f].setNome(Teclado.lerString("Digite o nome do funciorio:"));
				equipe[f].setMat(Teclado.lerInteiro("Digite a matricula"));
				equipe[f].setSalario(Teclado.lerDouble("Digite o salario do funcionario"));
				System.out.println("");
				f++;
				break;
			case 2://Atualização
				boolean achou=false;
				int mat = Teclado.lerInteiro("Digite a matricula que deseja fazer a alteração:");
				for(int i = 0; i<equipe.length ; i++) {
					if(mat==equipe[i].getMat()) {
						equipe[i].setSalario(Teclado.lerDouble("Digite o novo salario:"));
						achou = true;
						break;
					}
				}
				if(achou==false) {
					System.out.println("Matricula não encontra! Tente novamente.");
				}
				break;
			case 3://Exclusão
				f--;
				break;
			case 4://Mostrar cadastros
				for (int i = 0; i<f; i++) {
					System.out.printf("Nome: %s  Matricula: %d  Salario: %.2f\n",equipe[i].getNome(),equipe[i].getMat(),equipe[i].getSalario());
				}
		
				break;
			case 0://Sair
				break;
			default:
				System.out.println("Opção invalida! Tente novamente.");
				break;
			}
			
		}while(op!=0);
	}
	public int busca(Funcionario[] equipe) {
		int op=99;
		do {
		System.out.printf("Por qual atributo deseja realizar a busca\n1 - Nome\n2 - Matricula\n0 - Retornar ao menu principal\n");
		op = Teclado.lerInteiro("");
		switch(op) {
		case 1://Busca por nome
			String nome = Teclado.lerString("Digite o nome:");
			for(int i = 0; i<equipe.length; i++) {
				if(nome.equals(equipe[i].getNome())) {
					return equipe[i].getMat();
				}
			}
			return -99;
		case 2://Busca por matricula
			int mat = Teclado.lerInteiro("Digite a matricula:");
			for(int i = 0; i<equipe.length; i++) {
				if(mat==equipe[i].getMat()) {
					return mat;
				}
			}
			return -99;
		case 0:
			System.out.println("Cancelando operação...");
			break;
		default:
			System.out.println("Opção invalida! Tente novamente.");
			break;
		}
		}while(op!=0);
		return -99;
	}
}
