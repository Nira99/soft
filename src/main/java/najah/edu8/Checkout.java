package najah.edu8;

public class Checkout {
	private int rt = 0 ;
	
	
	

public long total() {
	
	return rt;
}


public void add(Integer itemcount, int price) {
	// TODO Auto-generated method stub
	rt+= (itemcount.intValue()*price);
}




}
