package structuralpatterns.decorator;

public class RedShapeDecorator extends ShapeDecorator {

  public RedShapeDecorator(Shape decoratedShape) {
     super(decoratedShape);		
  }

  @Override
  public void draw() {
     decoratedShape.draw();	       
     setRedBorder(decoratedShape); // change borders
  }

  private void setRedBorder(Shape decoratedShape){ // only notify the change
     System.out.println("Border Color: Red");
  }
  
}
