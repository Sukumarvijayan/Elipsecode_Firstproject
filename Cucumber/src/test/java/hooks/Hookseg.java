package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hookseg {
	
	//@Before(order=1)
	public void beforeopeartion() {
		System.out.println("Suku studied day and night");
	}
	//@Before(order=0)
	public void beforetobeforeopeartion() {
		System.out.println("Suku born");
	}
	//@After(order=1)
    public void afteroperation() {
		System.out.println("Suku handfull of salary");
	}
	//@After(order=0)
    public void aftertoafteroperation() {
		System.out.println("Suku married to kirubha");
	}
}
