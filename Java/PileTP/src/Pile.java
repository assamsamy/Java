import java.util.LinkedList;

public class Pile {
	private LinkedList<Integer> T = new LinkedList<Integer>();
	
	public void empiler(int x) {
		T.add(x);
	}
	public int depiler() {
		return T.removeLast();
	}
	public boolean PileVide() {
		return (T.size() ==0);
	}
	
	public void afficher() {
		for( Integer i : T) {
			System.out.println(i);
		}
	}
	
}
