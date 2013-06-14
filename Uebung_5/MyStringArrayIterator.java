public class MyStringArrayIterator implements Iterator<String> {

	String[] array; 
	int currentPos; 

	public MyStringArrayIterator(String[] array) { 
		this.array = array;
		this.currentPos = 0;
	}

	public boolean hasNext() {
		return currentPos - 1 < array.length;
	}

	public String next() {
		return array[currentPos++];
	}

	public void remove() {
		String[] newArray = new String[array.length - 1];
		
		int newIndex = 0;

		for (int i = 0; i< array.length; i++)
		{
			if (i == currentPos)
				continue;
			else 
				newArray[newIndex++] = array[i];
		}

		this.currentPos--;
		this.array = newArray;
	}
}
