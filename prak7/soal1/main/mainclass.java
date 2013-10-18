page main; 

import service. calculatorservice;
import service. impl. calculatorserviceimpl;

public class mainclass {
	public static main (string[] args) 	{
			calculatorservice service = new
			calculatorserviceimpl();
			
			integer a= service. tambah (200, 4);
			integer a= service. kurang (200, 4);
			integer a= service. bagi (200, 4);
			integer a= service. kali (200, 4);
			
			system.out.println ("ountput");
			system.out.println ("nilai a :" + a);
			system.out.println ("nilai b :" + b);
			system.out.println ("nilai c :" + c);
			system.out.println ("nilai d :" + d);
	}
}