//Ioanna-Maria Avanidi A.M. 4977

public class Square extends shape{
	public Square(int sqrArea){
		super(sqrArea);
	}
	
	public double computeArea(){
		double area = getSqrArea();
		return area;
	}
	
	public String getType(){
		return "Square";
	}
}