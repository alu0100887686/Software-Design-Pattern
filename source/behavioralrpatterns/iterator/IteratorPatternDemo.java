package behavioralrpatterns.iterator;

public class IteratorPatternDemo {
	
  public static void main(String[] args) {
  	 // collection
     NameRepository namesRepository = new NameRepository();
     // Iterator
     for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
        String name = (String)iter.next();
        System.out.println("Name : " + name);
     } 	
  }
}
