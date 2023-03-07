package emprego.faculdade;

public class EmpregoFaculdade {
	private String nome = "Julio";
	private double salario = 2000;
	private int horasAula = 5;	
	
	public EmpregoFaculdade() {
		super();
		this.nome = nome;
		this.salario = salario;
		this.horasAula = horasAula;
	}
	
	double getGastos() {
		return salario + (horasAula*40);
	}
	
	String getInfor() {
		return "Nome: " + this.nome + " com salario " + (salario+(horasAula*40));
	}
	
}
