package xxx;

public class CubeTest {
	
	public static void main(String []args) {
		try {
			Cube c2 = new Cube();
			c2.setLength(10);
			System.out.println(c2.getVolume());
		} catch (CubeException e) {
			e.printStackTrace();
			
		}
	}

}
