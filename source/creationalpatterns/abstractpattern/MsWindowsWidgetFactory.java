package creationalpatterns.abstractpattern;

// ConcreteFactory1
public class MsWindowsWidgetFactory implements AbstractWidgetFactory{
	// Create an MSWindow
	public Window createWindow(){
	  MSWindow window = new MSWindow();
	  return window;
	}
}
