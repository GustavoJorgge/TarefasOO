package notas.aluno;

import java.util.Scanner;

public class AlunoMain {
	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
		Double av1, av2, avE;
		Aluno aluno = new Aluno();
		
		System.out.printf("Entre com o nome:");
		aluno.nome = ler.nextLine();
		System.out.printf("Entre com matricula:");
		aluno.matricula = ler.nextLine();
		System.out.printf("Qual o curso do aluno:");
		aluno.curso = ler.nextLine();
		System.out.printf("Qual o periodo do curso:");
		aluno.periodo = ler.nextLine();
		ler = new Scanner(System.in);
		
		//Entrando com as notas e passando os valores para o metodo
		System.out.printf("Entre com a nota da AV1:");
		av1 = ler.nextDouble();		
		aluno.alterarNotaAv1(av1);//Passando valor da AV1
		System.out.printf("Entre com a nota da AV2:");
		av2 = ler.nextDouble();	
		aluno.alterarNotaAv2(av2);//Passando valor da AV2
		
		//Chamando o metodo para avaliar o Aluno
		aluno.avaliarAluno();
		
		//condição caso o aluno esteja em recuperação
		if(aluno.total < 60) {
			System.out.printf("\nEntre com a nota da AE:");
			avE = ler.nextDouble();
			aluno.alterarNotaAE(avE);//Passando valor da AVE
			aluno.avaliarRecuperacao();//Metodo da recuperação
		}			
	}
}
