import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cylindre A = new Cylindre();
		A.afficher();
		
		Scanner sc = new Scanner(System.in);
		String s;
		
		Point [] T = new Point[Integer.parseInt(args[0])];
		// remplissage
		for(int i=0;i<T.length;i++) {
			//choix
			do {
			System.out.println("P-> Point, C-> Cercle, L-> Cylindre");
			s = sc.next();
			} while((!s.equals("P")) && (!s.equals("C")) && (!s.equals("L")));
			
			switch(s){
				case "P":{
					System.out.println("Donnez X et Y");
					
					int x = sc.nextInt();
					int y = sc.nextInt();
					T[i] = new Point(x,y);
					break;
				}
				case "C":{
					System.out.println("Donnez X, Y, un rayon R, et sa couleur");
					
					double x = sc.nextInt();
					double y = sc.nextInt();
					
					double r = sc.nextDouble();
					String c = sc.next();
					T[i] = new Cercle(x, y, r, c);
					break;
				}
				case "L":{
					System.out.println("Donnez X, Y, un rayon R, sa couleur et la hauteur H");
					
					double x = sc.nextInt();
					double y = sc.nextInt();
					
					
					double r = sc.nextDouble();
					String c = sc.next();
					double h = sc.nextDouble();
					
					T[i] = new Cylindre(x, y, r, h, c);
					break;
				}
			
			  }
			}
			for(int i=0; i < T.length; i++) {
				T[i].afficher();
			}
			Cercle c; Cylindre cy;
			for(int i=0; i < T.length; i++) {
				if(T[i] instanceof Cercle) {
					c = (Cercle) T[i];
					System.out.println(c.surface());
				} 
				else if(T[i] instanceof Cylindre) {
					cy = (Cylindre) T[i];
					System.out.println(cy.volume());
				}
			}
		}
		
} 



