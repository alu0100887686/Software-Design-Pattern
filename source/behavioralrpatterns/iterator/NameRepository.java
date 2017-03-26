package behavioralrpatterns.iterator;

public class NameRepository implements Container {
  
	// collection
	public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

	// Name Iterator Methods
  private class NameIterator implements Iterator {

  	 // Iterator index
     int index;

     @Override
     public boolean hasNext() {
     
        if(index < names.length){
           return true;
        }
        return false;
     }

     @Override
     public Object next() {
     
        if(this.hasNext()){
           return names[index++];
        }
        return null;
     }
     
  }
  
  @Override
  public Iterator getIterator() {
     return new NameIterator();
  }
}
