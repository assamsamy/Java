
public class Girl extends Parent {
	private int a ;
	public Girl(int a) {
		super(a);
		this.a = a;

	}
	public void afficher() {
		System.out.println("Salut je suis une fille de Parent et mon a = " + a);
	}
}
