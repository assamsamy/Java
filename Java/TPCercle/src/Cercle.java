
public class Cercle extends Point {
	private Point centre;
	private String couleur;
	private double rayon;
	
	public Cercle(double x, double y, double r, String c) {
		centre = new Point(x,y);
		couleur = c;
		rayon = r;	
	}
	public Cercle(Point p, double r) {
		centre = p;
		rayon = r;
	}
	public void deplacer(double dx, double dy) {
		centre.move(dx,dy);
	}
	public void setx(double x) {
		centre.setx(x);
	}
	public void sety(double y) {
		centre.sety(y);
	}
	public double getx() {
		return centre.getx();
	}
	public double gety() {
		return centre.gety();
	}
	public boolean equals(Cercle c) {
		
		return ((centre.equals(c.centre) && this.rayon == c.rayon));
	}
	
	public boolean equals(Object o) {
		if(o instanceof Cercle) {
			
		
			Cercle c = (Cercle) o;
			return(( c.centre.equals(centre)) && (rayon == c.rayon));
		}
		return false;
	
	}
	public double getr() {

		return rayon;
	}
	public double surface() {
		return Math.PI*Math.pow(rayon, 2);
		
	}
	public String toString() {
		return "Rayon: " + rayon +" couleur: "+ couleur;
	}
	public void afficher() {
		System.out.println(this);
	}
}

