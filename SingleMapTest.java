import org.junit.*;
import static org.junit.Assert.*;
public class SingleMapTest {
	private	SingleMapImpl myMap;

	@Before
	public void buildUp() {
	// A file is created here to be used in every test.
	myMap = new SingleMapImpl();
	}
	@After
	public void cleanUp() {
	// The file is deleted here, after each test ends
	myMap = null;
	}

	@Test
	public void testMap() {	
		myMap.put(5, "Kostas");
		assertEquals("Kostas", myMap.get(5));
		
		}
		
	@Test
	public void testMap2() {
		myMap.put(5, "Kostas");
		assertEquals(false, myMap.isEmpty());
		
		myMap.remove(5);
		assertEquals(null, myMap.get(5));
		
		assertEquals(true, myMap.isEmpty());
		}
	
}