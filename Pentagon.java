//Ioanna-Maria Avanidi A.M. 4977

public class Pentagon extends shape{
	public Pentagon(int sqrArea){
		super(sqrArea);
	}
	
	public double computeArea(){
		double area = getSqrArea()*3/(double)4;
		return area;
	}
	
	public String getType(){
		return "Pentagon";
	}
}