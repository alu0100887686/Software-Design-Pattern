package creationalpatterns.abstractpattern;

// ConcreteProductA1
public class MSWindow implements Window{
	public void setTitle(String text){
		System.out.println("I'm a Windows: " + text);
	}
	public void repaint(){
	  // MS Windows specific behaviour
	}
}


