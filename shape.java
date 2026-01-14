//Ioanna-Maria Avanidi A.M. 4977

public abstract class shape{
	private int sqrArea;
	
	public abstract double computeArea();
	public abstract String getType();
	
	public shape(int sqrArea){
		this.sqrArea=sqrArea;
	}
	
	public boolean sameArea(shape otherShape){
		if (this.computeArea()==otherShape.computeArea()){
			return true;
		}
		return false;
	}
	
	public boolean sameType(shape otherShape){
		if (this.getType().equals(otherShape.getType())){
			return true;
		}
		return false;
	}
	
	public String toString(){
		String s = this.getType() +": " +this.computeArea();
		return s;
	}
	
	public int getSqrArea(){
		return sqrArea;
	}
}