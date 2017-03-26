package behavioralrpatterns.observer;
/** MVCPatternDemo execute the MVC currency converter model.
 * @author  Abián Torres Torres
 * @since   2017-03-19
 * @version 1.0.0
 * @see     alu0100887686@ull.edu.es
 * @see     https://github.com/alu0100887686 */
/********
*IMPORTS*
********/
import java.awt.EventQueue;

import behavioralrpatterns.observer.mvc.ConverterController;
import behavioralrpatterns.observer.mvc.ConverterView;
import behavioralrpatterns.observer.mvc.EuroModel;

/******
*CLASS*
******/
public class MVCPatternDemo {
	
	/***********
	*ATRIBUTTES*
	***********/
	static ConverterController controllerUsd, controllerAud, controllerInr, controllerGbp;
	static ConverterView view;
	static EuroModel modelUsd, modelAud, modelInr, modelGbp;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view = new ConverterView();
					modelUsd = new EuroModel(); // Models 
					modelAud = new EuroModel();
					modelInr = new EuroModel();
					modelGbp = new EuroModel();
					controllerUsd = new ConverterController(view, modelUsd); // Controllers
					controllerAud = new ConverterController(view, modelAud);
					controllerInr = new ConverterController(view, modelInr);
					controllerGbp = new ConverterController(view, modelGbp);
					modelAud.addObserver(view.getAud()); // Observers 
					modelInr.addObserver(view.getInr());
					modelUsd.addObserver(view.getUsd());
					modelGbp.addObserver(view.getGbp());
					view.getAud().addController(controllerAud); // Add controllers to panels
					view.getUsd().addController(controllerUsd);
					view.getInr().addController(controllerInr);
					view.getGbp().addController(controllerGbp);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}); 

	}

}
