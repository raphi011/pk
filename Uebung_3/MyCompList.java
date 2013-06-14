import java.util.*;

public class MyCompList<A extends Comparable<A>> extends MyList<A>
{
	public A minimum(Comparator<A> comp)
	{
		if (size() == 0)
			return null;
		
		A min = head.getValue();

		for (int i = 0; i < size(); i++)
		{
			A next = get(i);
			
			int compareResult;

			if (comp == null)
				compareResult = next.compareTo(min);
			else 
				compareResult = comp.compare(next,min);

			if (compareResult < 0)
				min = next;
		}

		return min;
	}

	public A minimum()
	{
		return minimum(null);	
	}
}
