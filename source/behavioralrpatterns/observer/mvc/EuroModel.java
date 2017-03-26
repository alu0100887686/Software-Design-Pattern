/** EuroModel implements a Currency converter, from EUR to USD, GBP, AUD and INR.
 * @author  Abián Torres Torres
 * @since   2017-03-19
 * @version 1.0.0
 * @see     alu0100887686@ull.edu.es
 * @see     https://github.com/alu0100887686 */
/********
*PACKAGE*
********/
package behavioralrpatterns.observer.mvc;

/**************
*CURRENCY ENUM*
**************/
enum Currency{
	
	// Conversion factor: Euro, US Dollar, British Pound, Australian Dollar and Indian Rupee
	USD("USD", 1.07527),
	GBP("GBP", 0.867957),
	AUD("AUD", 1.39699),
	INR("INR", 70.3612);
	
	private final String CURRENCY; // Currency
	private final Double CFACTOR;  // Factor
	
	Currency(String currency, Double cfactor){
		CURRENCY = currency;
		CFACTOR  = cfactor;
	}
	
	public String getCurrency(){
		return CURRENCY;
	}
	
	public Double getCFactor(){
		return CFACTOR;
	}

}

// currency Euro class.
/************
*MODEL CLASS*
************/
public class EuroModel extends java.util.Observable {
	
	/**********
	*CONVERTER*
	**********/
	/** covertTo change a given value, specified by the correspond currency
	 * identifier, to EUR. 
	 * @param value
	 * @param currency Currency Identifier */
	public void covertTo(Double value, String currency){
		if(value < 0.0)
			throw new IllegalArgumentException("Illegal value: " + value);
		setChanged();
		notifyObservers(value*getCf(currency)); // Notify the observer view
	}
	
	/*******
	*GETTER*
	*******/
	/**
	 * getCf Returns a currency changer factor to EUR
	 * @param currency Currency Identifier
	 * @return Correponding cf value
	 */
	public Double getCf(String currency){
		for (Currency iterator : Currency.values()) // iterates the enum currencies
			if (iterator.getCurrency().equals(currency)) // checks if the current element is the one
				return iterator.getCFactor();            // we are locking for
		throw new IllegalArgumentException("Illegal currency: " + currency);
	}

}
