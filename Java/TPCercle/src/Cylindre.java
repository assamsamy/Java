
public class Cylindre extends Cercle {
	
	private double hauteur = 0;
	
	public Cylindre(double x, double y, double r, double hauteur, String couleur) {
		super(x, y, r, couleur);
		this.hauteur = hauteur;
		
	}
	public Cylindre () {
		super(0,0,0, "rouge");
	}

	public double volume() {
		return super.surface() * hauteur;
		
	}
	
	public boolean equals(Object o) {
		if(o instanceof Cylindre) {
			Cylindre c = (Cylindre) o; 
			return (super.equals((Cercle )c) && this.hauteur == c.hauteur);
		}
		return false;
	}
	
	public String toString() {
		return super.toString() + " hauteur: " + hauteur;
	}
	public void afficher() {
		System.out.println(this);
	}
}
