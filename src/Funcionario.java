public class Funcionario {
	private int matricula;
	private String nome;
	private double salario;
	public void setMat(int mat) {
		this.matricula=mat;
	}
	public void setNome(String nome){
		this.nome=nome;
	}
	public void setSalario(double salario) {
		this.salario=salario;
	}
	public String getNome() {
		return this.nome;
	}
	public double getSalario() {
		return this.salario;
	}
	public int getMat() {
		return this.matricula;
	}
}
