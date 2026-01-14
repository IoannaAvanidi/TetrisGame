//Ioanna-Maria Avanidi A.M. 4977

import java.util.Random;

class ShapeGenerator{
	private shape[] myArray;
	private int[] sqrAreaA={1, 2, 3, 4, 8, 12, 16};
	
	public ShapeGenerator(int NpT){
		initializeShape(NpT);
	}

	private void initializeShape(int NpT){
		myArray = new shape[4*NpT];

		for(int i=0; i<NpT; i++){
			myArray[i] = new Square(randSqrArea());
		}

		for(int i=NpT; i<2*NpT; i++){
			myArray[i] = new Triangle(randSqrArea());
		}

		for(int i=2*NpT; i<3*NpT; i++){
			myArray[i] = new Circle(randSqrArea());
		}

		for(int i=3*NpT; i<4*NpT; i++){
			myArray[i] = new Pentagon(randSqrArea());
		}
		
		Random numb = new Random();
		for (int i=0; i<myArray.length; i++){
			int rndPos = numb.nextInt(myArray.length);
			shape temp = myArray[i];
			myArray[i] = myArray[rndPos];
			myArray[rndPos] = temp;
		}
	}

	public int randSqrArea(){
		int rnd = new Random().nextInt(sqrAreaA.length);
		return sqrAreaA[rnd];
	}

	public shape nextShape(){
		Random rand = new Random();
		int x = rand.nextInt(myArray.length);
		
		while (!sosForHasShape(x)) {
			x=rand.nextInt(myArray.length);
		}

		int pos = x;
		shape nShape = myArray[pos];
		myArray[pos] = null;
		return nShape;
	}

	public boolean sosForHasShape(int sos){
		if(myArray[sos]!=null){
			return true;
		}
		return false;
	}

	public boolean hasShape(){
		for (int i = 0; i < myArray.length; i++) {
			if(sosForHasShape(i)){
				return true;
			}
		}return false;
	}

	public String toString(){
		String sShape = " ";

		for(shape shapes: myArray){
			if (shapes == null){
				continue;
			}
			sShape += shapes.getType() +" ";
		}
		return sShape;
	}
	public static void main(String[] args) {
		ShapeGenerator sGen = new ShapeGenerator(2);

		while(sGen.hasShape()){
			System.out.println(sGen.nextShape());
			System.out.println(sGen.toString());

		}
	}
}
