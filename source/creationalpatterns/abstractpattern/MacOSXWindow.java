package creationalpatterns.abstractpattern;

// ConcreteProductA2
public class MacOSXWindow implements Window{
	public void setTitle(String text){
	  System.out.println("I'm a Mac OSX: " + text);
	}
	public void repaint(){
	  // Mac OSX specific behaviour
	}
}
 