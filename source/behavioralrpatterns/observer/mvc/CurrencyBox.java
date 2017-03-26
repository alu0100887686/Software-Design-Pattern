/** MVCPatternDemo implements a simple currency data panel.
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
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Observable;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/***********
*VIEW CLASS*
***********/
public class CurrencyBox extends JPanel implements java.util.Observer{

	/***********
	*ATRIBUTTES*
	***********/
	private static final long serialVersionUID = 1L;
	JFormattedTextField cf, in; // cf and input text fields
	JTextField out; // output text fields

	/** Create the panel. */
	public CurrencyBox(String tittle, int x, int y, int z, int w) {
		
		setBounds(x, y, z, w); // Configure panel
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), 
				tittle, TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setLayout(null);
		JLabel lblEurIs = new JLabel("1 EUR is");
		lblEurIs.setBounds(6, 20, 61, 16);
		add(lblEurIs);
		cf = new JFormattedTextField();
		cf.setEditable(false);
		cf.setBounds(66, 15, 136, 26);
		add(cf);
		JLabel lblEur = new JLabel(tittle);
		lblEur.setBounds(214, 20, 61, 16);
		add(lblEur);
		JLabel lblEur_1 = new JLabel("EUR");
		lblEur_1.setBounds(6, 48, 61, 16);
		add(lblEur_1);
		in = new JFormattedTextField(); // input value
		in.setBounds(6, 69, 136, 26);
		add(in);
		JLabel lblUsd = new JLabel(tittle);
		lblUsd.setBounds(172, 53, 61, 16);
		add(lblUsd);
		out = new JTextField(); // output value
		out.setHorizontalAlignment(SwingConstants.LEFT);
		out.setEditable(false);
		out.setBounds(172, 69, 150, 26);
		add(out);
		out.setColumns(50);
	
	}
	
	/** update this.
	 * @param o 
	 * @arg arg
	 */
	@Override
	public void update(Observable o, Object arg) {
		out.setText(arg.toString());
	}
	
	/** addController add the corresponds listerner controller.
	 * @param controller
	 */
	public void addController(ActionListener controller){
		out.addActionListener(controller);
		in.addActionListener(controller);
	}
	
	public JFormattedTextField getCf() {
		return cf;
	}

	public void setCf(JFormattedTextField cf) {
		this.cf = cf;
	}

	public JFormattedTextField getIn() {
		return in;
	}

	public void setIn(JFormattedTextField in) {
		this.in = in;
	}

	public JTextField getOut() {
		return out;
	}

	public void setOut(JTextField out) {
		this.out = out;
	}
}
