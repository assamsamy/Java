
public class Child extends Amd {
	private int a;


	public void afficher() {

		System.out.println("Salut je suis un fils de Parent et le a passer en paramètre est = " + a);
		super.coucou();
		this.coucou();
	}
	public void coucou() {
		System.out.println("Coucou from Child");
	}

}
