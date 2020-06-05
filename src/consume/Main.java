package consume;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		Livro l1 = new Livro ("Concrete Mathematics", "Knuth");
		Livro l2 = new Livro ("Introduction to Algorithms", "Cormen");
		List <Livro> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		
		for (Livro livro : livros) {
			System.out.println(livro.toString());
		}
		
		Consumer <Livro> lambda1 = (Livro l) -> {System.out.println(l.toString());};
		livros.forEach(lambda1);
		
	}
}

class ExibeAutor implements Consumer <Livro> {
	@Override
	public void accept(Livro l) {
		System.out.println("Exemplo 02: " + l.toString());
	}
}
