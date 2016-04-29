package br.unifor.cct.cc.logica.pratica.dojo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//q03
		gabarito(ListaDeExercicio[]vetor);

	}
	static void gabarito (ListaDeExercicio[] vetor){
		Scanner scanner = new Scanner(System.in);
		//NP1
		char [] GabaritoNP1= new char[10]; 
		for (int i = 0; i < GabaritoNP1.length; i++) {	
			ListaDeExercicio aluno=new ListaDeExercicio();
			aluno=vetor[i];
			System.out.println("Informe a resposta correta da lista np1:");
			GabaritoNP1= scanner.next().charAt(0);
		}
		for (int i = 0; i < GabaritoNP1.length; i++) {
			ListaDeExercicio aluno=new ListaDeExercicio();
			aluno=vetor[i];
			if (aluno.gabaritonp1[i]==GabaritoNP1[i]){
				aluno.np1++;
			}
			vetor[i] = aluno;
		}
		//NP2
		char [] GabaritoNP2= new char[10];
		for (int i = 0; i < GabaritoNP2.length; i++) {	
			ListaDeExercicio aluno=new ListaDeExercicio();
			aluno=vetor[i];
			System.out.println("Informe a resposta correta da lista np2:");
			GabaritoNP2[i]= scanner.next().charAt(0);
		}
		for (int i = 0; i < GabaritoNP2.length; i++) {
			ListaDeExercicio aluno=new ListaDeExercicio();
			aluno=vetor[i];
			if (aluno.gabaritonp2[i]==GabaritoNP2[i]){
				aluno.np2++;

			}
			vetor[i] = aluno;
		}
		//NP3
		char [] GabaritoNP3= new char[10];
		for (int i = 0; i < GabaritoNP3.length; i++) {	
			ListaDeExercicio aluno=new ListaDeExercicio();
			aluno=vetor[i];
			System.out.println("Informe a resposta correta da lista np2:");
			GabaritoNP3[i]= scanner.next().charAt(0);
		}
		for (int i = 0; i < GabaritoNP3.length; i++) {
			ListaDeExercicio aluno=new ListaDeExercicio();
			aluno=vetor[i];
			if (aluno.gabaritonp3[i]==GabaritoNP3[i]){
				aluno.np3++;
			}
			vetor[i] = aluno;
		}
		//NP4
		char [] GabaritoNP4= new char[10];
		for (int i = 0; i < GabaritoNP4.length; i++) {	
			ListaDeExercicio aluno=new ListaDeExercicio();
			aluno=vetor[i];
			System.out.println("Informe a resposta correta da lista np2:");
			GabaritoNP4[i]= scanner.next().charAt(0);
		}
		for (int i = 0; i < GabaritoNP3.length; i++) {
			ListaDeExercicio aluno=new ListaDeExercicio();
			aluno=vetor[i];
			if (aluno.gabaritonp4[i]==GabaritoNP4[i]){
				aluno.np4++;
			}
			vetor[i] = aluno;
		}
		//Média
		for (int i = 0; i < vetor.length; i++) {
			ListaDeExercicio aluno = new ListaDeExercicio();
			aluno = vetor[i];

			aluno.media = (aluno.np1+ aluno.np2 + aluno.np3 + aluno.np4)/4; 			
			vetor[i] = aluno;
		}

	}

}
