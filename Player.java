//Ioanna-Maria Avanidi A.M.4977

import java.util.Scanner;

class Player{
    private shape[] myStack;
    private int capacity;
    private int size;
    private double playerPoints=0;

    public Player(int capacity){
        this.capacity = capacity;
        myStack = new shape[capacity];
    }

    public void push(shape element){
        if(size == capacity){
            System.out.println("Cannot enter any more elements" );
        }
        myStack[size] = element;
        size++;
    }

    public shape pop(){
        if(size == 0){
            System.out.println("No elements to pop");
            return null;
        }
        size --;
        return myStack[size];
    }
    
    public void playShape(shape newShape){
        System.out.println("Incoming shape: " +newShape);
        System.out.println("Do you want to accept? (y/n)");
        Scanner keyboard = new Scanner(System.in);
        String out = keyboard.nextLine();

        if(out.equals("y")){
            push(newShape);

            if(this.size>=2){
                if(newShape.sameArea(this.myStack[size-2])){
                    playerPoints += newShape.computeArea() * 10;
                    System.out.println("10X points!");
                    System.out.println("Added " +10*newShape.computeArea() +" points");
                }else if(newShape.sameType(this.myStack[size-2])){
                    pop();
                    pop();
                    playerPoints += newShape.computeArea();
                    System.out.println("Added " +newShape.computeArea() +" points");
                    System.out.println("Top shapes removed!");
                }else if(newShape.sameArea(this.myStack[size-2]) && newShape.sameType(this.myStack[size-2])){
                    playerPoints += newShape.computeArea() *10;
                    pop();
                    pop();
                    System.out.println("10X points!");
                    System.out.println("Top shapes removed!");
                    System.out.println("Added " +10*newShape.computeArea() +" points");
                }else {
                    playerPoints += newShape.computeArea();
                    System.out.println("Added " +newShape.computeArea() +" points");
                }
            }else {
                playerPoints += newShape.computeArea();
                System.out.println("Added " +newShape.computeArea() +" points");
            }

        }else if(out.equals("n")){
            playerPoints += newShape.computeArea();
			System.out.println("Added " +newShape.computeArea() +" points");
        }
    }

    public boolean isStackFull(){
        if(this.capacity==this.size){
            return true;
        }
        return false;
    }

    public void printStack(){
        if (isStackFull()){
            System.out.print("");
        } else {
            System.out.println("Current stack: ");

            for (int i = size; i >= 0; i--) {
                if(myStack[i]==null){
                    continue;
                } 
                System.out.println("\t" +(i+1) +": " +myStack[i] );
            }
        }
    }

    public double getPlayerPoints(){
        return playerPoints;
    }
}