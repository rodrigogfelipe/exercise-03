import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler o nome (apenas uma palavra) e idade de duas pessoas. Ao final mostrar
 * uma mensagem com os nomes e a idade média entre essas pessoas, com uma casa decimal.. 
 * */
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner tcl = new Scanner(System.in);
		
		String nome1,nome2; 
		int idade1, idade2;
		
		nome1= tcl.next();
		idade1= tcl.nextInt();
		
		nome2= tcl.next();
		idade2= tcl.nextInt();
		
		double media= (double) (idade1 + idade2) / 2;
		
		System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, media);
		
		
		
		
		
		tcl.close();
		
		 

	}

}
