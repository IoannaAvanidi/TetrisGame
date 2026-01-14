//Ioanna-Maria Avanidi A.M. 4977

public class Circle extends shape{
	public Circle(int sqrArea){
		super(sqrArea);
	}
	
	public double computeArea(){
		double area = getSqrArea()*Math.PI*1/(double)4;
		return area;
	}
	
	public String getType(){
		return "Circle";
	}
}