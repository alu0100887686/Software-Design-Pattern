/** ConverterView implements a simple GUI for a 
 * currency converter.
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

/********
*IMPORTS*
********/
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/***********
*VIEW CLASS*
***********/
public class ConverterView extends JFrame  {
	
	/***********
	*ATRIBUTTES*
	***********/
	private static final long serialVersionUID = 1L;
	protected JPanel contentPane;
	CurrencyBox usd, gbp, aud, inr; //Currency Panels

	/************
	*CONSTRUCTOR*
	************/
	/** ConverterView create the frame. */
	public ConverterView() {
		setResizable(false); // Configure frame
		setTitle("Currency Charger");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 624);
		contentPane = new JPanel(); // Configure main panel
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		usd = new CurrencyBox("USD", 33, 40, 332, 124); // Set currency panels
		gbp = new CurrencyBox("GBP", 33, 176, 332, 124);
		aud = new CurrencyBox("AUD", 33, 312, 332, 124);
		inr = new CurrencyBox("INR", 33, 448, 332, 124);
		contentPane.add(usd);
		contentPane.add(gbp);
		contentPane.add(aud);
		contentPane.add(inr);
	}
	
	/*******************
	*GETTERS AND SETTER*
	*******************/
	/** setCf set the corresponds cf values for each currency. 
	 * @param usd
	 * @param gbp
	 * @param aud
	 * @param inr */
	public void setCf(String usd, String gbp, String aud, String inr) {
		this.getUsd().getCf().setText(usd);
		this.getGbp().getCf().setText(gbp);
		this.getAud().getCf().setText(aud);
		this.getInr().getCf().setText(inr);
	}	
	
	public CurrencyBox getUsd() {
		return usd;
	}

	public void setUsd(CurrencyBox usd) {
		this.usd = usd;
	}

	public CurrencyBox getGbp() {
		return gbp;
	}

	public void setGbp(CurrencyBox gbp) {
		this.gbp = gbp;
	}

	public CurrencyBox getAud() {
		return aud;
	}

	public void setAud(CurrencyBox aud) {
		this.aud = aud;
	}

	public CurrencyBox getInr() {
		return inr;
	}

	public void setInr(CurrencyBox inr) {
		this.inr = inr;
	}
	
}
