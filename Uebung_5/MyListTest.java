import java.util.*;

public class MyListTest
{
	public static void main(String[] args)
	{
		MyList<String> asd = new MyList<String>();

		
		asd.add("Bla1");
		asd.add("Bla2");
		asd.add("Bla3");
		asd.add("Bla4");
		asd.add("Bla5");
		asd.add("Bla6");
	
		Iterator itr = asd.iterator();
		itr.next();
		itr.remove();
		
		for (String str : asd)
			System.out.println(str);


	}


}
