import java.util.Random;

class Point {

    public float x;
    public float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
        System.out.println("Point [" + x + ", " + y + "] has been created.");
    }

    public void movePoint(float xAxisShift, float yAxisShift) {
        this.x += xAxisShift;
        this.y += yAxisShift;
    }
}

class Square {
	public Point LeftDownVertex;
	public float length;
	
	public Square (Point LeftDownVertex, float length) {
		this.LeftDownVertex=LeftDownVertex;
		this.length=length;
	}
	
	public void makeSquare (){
		System.out.println("Vertex1 = ("+ this.LeftDownVertex.x +","+ this.LeftDownVertex.y+")");
		System.out.println("Vertex2 = ("+ (this.LeftDownVertex.x+this.length) +","+ this.LeftDownVertex.y+")");
		System.out.println("Vertex3 = ("+ (this.LeftDownVertex.x +this.length)+","+ (this.LeftDownVertex.y+this.length)+")");
		System.out.println("Vertex4 = ("+ this.LeftDownVertex.x +","+ (this.LeftDownVertex.y+this.length)+")");
	}
	
}

class Circle {
    public Point center;
    public float radius;

    public Circle(Point center, float radius) {
        this.center = center;
        this.radius = radius;
    }

    public void printCoordinates() {
        System.out.println("x: " + this.center.x);
        System.out.println("y: " + this.center.y);
    }
}

public class Main {

    public static void main(String[] args) {
        float inputX = 0;
        float inputY = 0;
        float inputRadius = 5;
        int n=5;
        

        Point point = new Point(inputX, inputY);
        Circle circle = new Circle(point, inputRadius);

        circle.center.movePoint(Main.getRandomNumber(), Main.getRandomNumber());
        circle.printCoordinates();
        
        for(n=5; n>0; n--) {
        	float length = Main.getRandomNumber();
        	Point LeftDownVertex = new Point(Main.getRandomNumber(), Main.getRandomNumber());
        	Square square1 = new Square(LeftDownVertex, length);
        	System.out.println("Square "+ n);
        	square1.makeSquare();
        	System.out.println();
        }
    }

    public static float getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(10);
    }

