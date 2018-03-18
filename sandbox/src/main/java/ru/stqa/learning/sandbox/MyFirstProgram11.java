package ru.stqa.learning.sandbox;

public class MyFirstProgram11 {
	public static void main (String[] args){

    Square s = new Square (5);
    System.out.println("Площадь квадрата со стороной " + s.l +"="+ s.area() );

    Rectangle r = new Rectangle(4, 5);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + "=" + r.area());
	}
  }




