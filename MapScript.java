public class MapScript {
	public static void main(String[] args) {
		MapScript script = new MapScript();
		script.launch();
	}
 
	public void launch() {
		SingleMapImpl myMap  = new SingleMapImpl();
		myMap.isEmpty();
		myMap.put(5, "Kostas");
		myMap.put(10, "Kostas2");;
		myMap.put(1251, "Kostas3");
		myMap.put(15, "Kostas4");
		myMap.put(25, "Kostas5");
		myMap.remove(14);
		myMap.isEmpty();
		
	}
}	