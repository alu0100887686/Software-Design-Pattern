package creationalpatterns.abstractpattern;

// ConcreteFactory2
public class MacOSXWidgetFactory implements AbstractWidgetFactory{
	// Create a MacOSXWindow
	public Window createWindow(){
	  MacOSXWindow window = new MacOSXWindow();
	  return window;
	}
}
