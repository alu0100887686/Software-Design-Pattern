/**ConverterController implements a MVC controller component which
 * managements the flow of interactions an EuroModel and CoverterView component.
 *    
 * @author  Abián Torres Torres
 * @since   2017-03-19
 * @version 1.0.0
 * @see     alu0100887686@ull.edu.es
 * @see     https://github.com/alu0100887686 */
/********
*PACKAGE*
********/
package behavioralrpatterns.observer.mvc;

/***************
*LISTENER CLASS*
***************/
public class ConverterController implements java.awt.event.ActionListener {
	
	/***********
	*ATRIBUTTES*
	***********/
	private ConverterView view; // GUI
	private EuroModel model;    // MODEL
	
	/************
	*CONSTRUCTOR*
	************/
	/** ConverterController, build current controller by the specified view and model.
	 * @param view 
	 * @param model */
	public ConverterController(ConverterView view, EuroModel model){
		this.view = view;
		this.model = model;
		view.setCf(model.getCf("USD").toString(), model.getCf("GBP").toString(),
				model.getCf("AUD").toString(), model.getCf("INR").toString()); // Set cf's on view
		view.setVisible(true);
	}
	
	/***********************
	*INTERACTION MANAGEMENT*
	***********************/
	/** actionPerformed checks the event source and execute
	 * the corresponds action on model.
	 * @param e */
	public void actionPerformed(java.awt.event.ActionEvent e) {
		if(e.getSource()==getView().getUsd().getIn()) 
			model.covertTo(Double.parseDouble(getView().getUsd().getIn().getText()), "USD"); // USD source
		else if(e.getSource()==getView().getAud().getIn())
			model.covertTo(Double.parseDouble(getView().getAud().getIn().getText()), "AUD"); // AUD source
		else if(e.getSource()==getView().getInr().getIn())
			model.covertTo(Double.parseDouble(getView().getInr().getIn().getText()), "INR"); // INR source
		else if(e.getSource()==getView().getGbp().getIn())
			model.covertTo(Double.parseDouble(getView().getGbp().getIn().getText()), "GBP"); // GBP source
	}
	
	public ConverterView getView() {
		return view;
	}

	public void setView(ConverterView view) {
		this.view = view;
	}

	public EuroModel getModel() {
		return model;
	}

	public void setModel(EuroModel model) {
		this.model = model;
	}

}
