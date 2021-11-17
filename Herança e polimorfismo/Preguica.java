package Heranca;

public class Preguica extends Animal {
	
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	
	public void som () {
		System.out.println("Fazendo som de preguiça ");
	}
	public void subirArvore () {
		System.out.println("Subindo na árvore ");
	}

}
