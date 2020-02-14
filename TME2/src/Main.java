import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		Interpreteur inter = new Interpreteur();
		
		try {
			inter.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
