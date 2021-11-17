package Heranca;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro cao1 = new Cachorro ("Super Cão",12);
		
		System.out.println("Nome do Cachorro: " + cao1.getNome());
		System.out.println("Idade do Cachorro: " + cao1.getIdade());
		cao1.correr();
		cao1.som();
		
		System.out.println();
		
		Cavalo cav1 = new Cavalo ("Bala no Alvo",15);
		
		System.out.println("Nome do Cavalo: " + cav1.getNome());
		System.out.println("Idade do Cachorro: " + cav1.getIdade());
		cav1.correr();
		cav1.som();
		
		System.out.println();
		
		Preguica preg1 = new Preguica ("Tobias",18);
		System.out.println("Nome da Preguiça: " + preg1.getNome());
		System.out.println("Idade da Preguica: " + preg1.getIdade());
		preg1.som();
		preg1.subirArvore();
		
	}


	}


