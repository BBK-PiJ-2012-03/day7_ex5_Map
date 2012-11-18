public class SingleMapImpl implements SingleMap {
  private String name;
  private String[] myArray = new String[1000];
  	
	public String put(int key, String name) {
		int hashKey = HashUtilities.shortHash(key); //fixed key to be < 1000
		
		if (myArray[hashKey] != null) {
			System.out.println ("Key already in use");
		} 
		else {
			myArray[hashKey] = name;
		}	
		return name;
	}	
			
	public String get(int key) {
		int hashKey =  HashUtilities.shortHash(key); //fixed key to be < 1000
		return myArray[hashKey];
	}

	public void remove(int key) {
		int hashKey =  HashUtilities.shortHash(key); //fixed key to be < 1000
		if (myArray[hashKey] != null) {
		myArray[hashKey] = null;
		System.out.println("Entry of key: " + hashKey + ", succesfully removed");
		}
	}
	
	public boolean isEmpty() {
		boolean isEmpty = true;
		for (int i = 0 ; i < 1000 ; i++) {
			
			if (myArray[i] != null) {
				isEmpty = false;
			}
		}
		if (isEmpty) {
			System.out.println("The map is empty");
		}
		else {
			System.out.println("The map is NOT empty");
		}	
		return isEmpty;
	}
}	
	