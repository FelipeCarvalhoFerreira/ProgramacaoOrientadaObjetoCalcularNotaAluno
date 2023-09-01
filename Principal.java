package ProgramacaoOrientadaObjetoCalcularNotaAluno;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Aluno aluno = new Aluno ();
		
		System.out.println("Nome do Aluno é:  ");
		aluno.aluno = sc.nextLine();
		
		System.out.println("Nota Primeiro Trimestre: ");
		aluno.primeiroTrimestre = sc.nextDouble();
		
		System.out.println("Nota Segundo Trimestre: ");
		aluno.segundoTrimestre = sc.nextDouble();
		
		System.out.println("Nota Terceiro Trimestre: ");
		aluno.terceiroTrimestre = sc.nextDouble();
		
		aluno.calcularMedia();
		
		
		sc.close();

	}

}
