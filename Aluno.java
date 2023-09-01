package ProgramacaoOrientadaObjetoCalcularNotaAluno;

public class Aluno {
	
	public String aluno;
	public double primeiroTrimestre;
	public double segundoTrimestre;
	public double terceiroTrimestre;
	
	public void calcularMedia () {
		double calcularMedia = primeiroTrimestre + segundoTrimestre + terceiroTrimestre;
			System.out.println("Media do Aluno é: " + calcularMedia);
			
		if (calcularMedia >= 60 && calcularMedia <= 100) {
			
				System.out.println("Aluno Aprovado");
			} else {
				System.out.println("Aluno Reprovado");
				
				double diferenca = 60 - (primeiroTrimestre + segundoTrimestre + terceiroTrimestre);
				System.out.println ("Falta " + diferenca + " ponto para media minima");
			}
			
		}	
	
			
		
	}

