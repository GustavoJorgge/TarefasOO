package notas.aluno;
public class Aluno {
	
	public String nome;	
	public String matricula;
	public double notaAv1, notaAv2, notaAE;
	public String curso;
	public String periodo;
	public double total;	
	
	public Aluno() {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.notaAv1 = notaAv1;
		this.notaAv2 = notaAv2;
		this.notaAE = notaAE;
		this.curso = curso;
		this.periodo = periodo;
	}
	
	public void alterarNotaAv1(double notaAv1) {		
		this.notaAv1 = notaAv1;
	}
	
	public void alterarNotaAv2(double notaAv2) {
		this.notaAv2 = notaAv2;
	}
	
	public void alterarNotaAE(double notaAE) {
		this.notaAE = notaAE;
	}
	
	public void avaliarAluno() {
		total = notaAv1+notaAv2;
		
		if(total >= 60) {
			System.out.println(" Nome:" + nome + "\n Matricula: " + matricula + "\n Curso: " + curso + "\n Periodo: " + periodo + "\n Nota AV1: " + notaAv1 + "\n Nota AV2: " + notaAv2 + "\n Total: " + total + "\n Aluno Aprovado!!\n");
		}else {
			System.out.println(" Nome:" + nome + "\n Matricula: " + matricula + "\n Curso: " + curso + "\n Periodo: " + periodo + "\n Nota AV1: " + notaAv1 + "\n Nota AV2: " + notaAv2 + "\n Total: " + total + "\n Aluno em Recuperação!!\n");
		}		
	}

	public void avaliarRecuperacao() {
		total= ((notaAv1 + notaAv2 + notaAE)/2);
		
		if( total >= 60) {
			System.out.println(" Nome:" + nome + "\n Matricula: " + matricula + "\n Curso: " + curso + "\n Periodo: " + periodo + "\n Nota AV1: " + notaAv1 + "\n Nota AV2: " + notaAv2 + "\n Nota AE:"+ notaAE+ "\n Total: " + total + "\n Aluno Aprovado!!\n");
		}else {
			System.out.println(" Nome:" + nome + "\n Matricula: " + matricula + "\n Curso: " + curso + "\n Periodo: " + periodo + "\n Nota AV1: " + notaAv1 + "\n Nota AV2: " + notaAv2 + "\n Nota AE:"+ notaAE+ "\n Total: " + total + "\n Aluno Reprovado!!\n");
		}		
	}
		
}