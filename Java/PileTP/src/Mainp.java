import java.util.Scanner;
public class Mainp {



		public static void main(String[] args) {
			Pile p = new Pile();
			int x, n;
			Scanner sc = new Scanner(System.in);
			
			//String s = " ";
			System.out.println("Donner un N");
		/*	System.out.println("inserer des entiers svp");
			s= sc.next();
			while(!s.equals("f")) {
				p.empiler(Integer.parseInt(s));
				s=sc.next();
			}
			
			while(!p.PileVide()) {
			    x = p.depiler();
				if(x %2 == 0) {
					p.empiler(x);
				}
				else p.empiler(x);
			}
			*/
			n = sc.nextInt();
			for(int i =0; i<n; i++) {
				x = sc.nextInt();
				p.empiler(x);
			}
			//Création de deux pile (Paire et Impaire)
			Pile imp = new Pile();
			Pile paire = new Pile();
			//Trie des entiers 
			
			while(!p.PileVide()) {
				x = p.depiler();
				if(x%2 == 0) {
					paire.empiler(x);
				}
				else imp.empiler(x);
			}
			
			System.out.println("La pile paire ");
			paire.afficher();
			
			System.out.println("La pile impaire");
			imp.afficher();
	}


}
