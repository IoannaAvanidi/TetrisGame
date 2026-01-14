//Ioanna-Maria Avanidi A.M. 4977

public class Triangle extends shape{
	public Triangle(int sqrArea){
		super(sqrArea);
	}
	
	public double computeArea(){
		double area = getSqrArea()/(double)2;
		return area;
	}
	
	public String getType(){
		return "Triangle";
	}
}