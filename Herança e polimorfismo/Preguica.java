package Heranca;

public class Preguica extends Animal {
	
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	
	public void som () {
		System.out.println("Fazendo som de pregui�a ");
	}
	public void subirArvore () {
		System.out.println("Subindo na �rvore ");
	}

}
