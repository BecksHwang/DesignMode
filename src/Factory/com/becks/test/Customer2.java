package Factory.com.becks.test;

import Factory.com.becks.entity.BMW320;
import Factory.com.becks.entity.BMW320Factory;
import Factory.com.becks.entity.BMW523;
import Factory.com.becks.entity.BMW523Factory;

public class Customer2 {
	public static void main(String[] args) {  
		BMW320Factory BMW320factory = new BMW320Factory();  
        BMW320 bmw320 = BMW320factory.createBMW();  
  
        BMW523Factory BMW523factory = new BMW523Factory();  
        BMW523 bmw523 = BMW523factory.createBMW();  
    }
}
