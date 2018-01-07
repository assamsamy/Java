public class Point{

 private double x,y;

 public Point(double x, double y){
	this.x = x;
	this.y = y;
}	
 public Point(){ }
public void setx(double x){ this.x = x; }
public void sety(double y){ this.y = y; }

public double getx(){ return x; }
public double gety(){ return y; }

public void move(double x, double y){ 
	setx(x);
	sety(y);

}

public void afficher(){
 System.out.println("("+ x+","+y+")");
}
public boolean equals(Point q){
return ((q.x == this.x )&& (q.y == this.y));


}

}

