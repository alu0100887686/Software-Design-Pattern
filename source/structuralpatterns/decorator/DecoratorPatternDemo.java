package structuralpatterns.decorator;

public class DecoratorPatternDemo {
  public static void main(String[] args) {

     Shape circle = new Circle();

     Shape redCircle = new RedShapeDecorator(new Circle()); // add new functionality
     Shape redRectangle = new RedShapeDecorator(new Rectangle()); // add new functionality
     
     System.out.println("Circle with normal border");
     circle.draw();

     System.out.println("\nCircle of red border");
     redCircle.draw();

     System.out.println("\nRectangle of red border"); 
     redRectangle.draw();
     
     redCircle = circle; // remove new functionality
     
     System.out.println("\nRemove new funcionality"); 
     redCircle.draw();
  }
}
