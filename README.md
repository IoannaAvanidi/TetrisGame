# Shape Stack Game (Java)

A Java-based strategy game inspired by Tetris, developed for the "Object-Oriented Programming Techniques" course. The game focuses on object-oriented principles such as **Inheritance**, **Polymorphism**, and **Interfaces**.

## 🎮 Game Description
The game features a shape generator that produces random geometric shapes (Squares, Triangles, Pentagons, and Circles) with random sizes.
* **Objective:** The player must decide whether to accept or reject each incoming shape to build a stack and maximize their score.
* **Stack Mechanic:** The player has a stack with a limited capacity. If the stack is full, the player must reject new shapes.
* **Scoring:** Points are awarded based on the area of the accepted shape.
* **Bonuses:** * If the player accepts the same shape twice in a row, they receive a **2x bonus** for the second shape.
    * If the player accepts the same shape three times in a row, they receive a **10x bonus** for the third shape.

## 🛠️ Technical Structure
The project implements a robust class hierarchy:

1.  **`Shape` (Abstract Class)**: The base class for all shapes, containing common properties like `id` and the abstract method `getArea()`.
2.  **Specific Shapes**: 
    * `Square`, `Triangle`, `Pentagon`, `Circle` (inheriting from `Shape`).
3.  **`ShapeGenerator`**: Generates a predefined number of shapes with random types and dimensions.
4.  **`Player`**: Manages the player's score and a `Stack` of shapes.
5.  **`ShapeGame`**: The main controller that handles the game loop and user interaction.

## 🚀 Key Concepts
* **Inheritance & Polymorphism:** All shapes inherit from a common base class, allowing the stack to store different types of shapes uniformly.
* **Interfaces:** Use of the `Comparable` interface to compare shapes based on their area.
* **Stack Implementation:** Custom logic to handle the LIFO (Last-In-First-Out) behavior of the shape collection.

## 📋 Execution Instructions
Compile all `.java` files and run the `ShapeGame` class:

```bash
javac *.java
java ShapeGame
