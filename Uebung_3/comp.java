import java.util.*; 

public class comp<A> implements Comparator<A> 
{
	public int compare(A o1, A o2) 
	{
		Comparable c1 = (Comparable)o1;
		Comparable c2 = (Comparable)o2;

		int comp = c1.compareTo(c2);

		if (comp == 0)
			return comp;

		return comp < 0 ? 1 : -1;
	}
}
