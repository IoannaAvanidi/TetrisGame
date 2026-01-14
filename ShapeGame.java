//Ioanna-Maria Avanidi A.M.4977
import java.util.Scanner;

class ShapeGame{
    public static void main(String[] args) {
        System.out.println("Give the number of shapes per type: ");
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        ShapeGenerator newShape = new ShapeGenerator(a);

        System.out.println("Give the size of the stack for the player: ");
        Scanner keyboard2 = new Scanner(System.in);
        int b = keyboard2.nextInt();
        Player p = new Player(b);

        while((newShape.hasShape()) && (!p.isStackFull())){
            p.playShape(newShape.nextShape());

            System.out.println(" ");

            p.printStack();

            System.out.println(" ");

            System.out.println("Player has " +p.getPlayerPoints() +" points");

            System.out.println(" ");
        } System.out.println("Game over!");
    }
}
