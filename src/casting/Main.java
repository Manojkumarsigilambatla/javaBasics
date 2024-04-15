package casting;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Dog dog = new Dog("black");  
		Animal animal = new Animal("White");  
		//System.out.println(animal.color);
		animal = dog;  
		animal.show("My dog");  
		  
		Animal animal1 = new Animal("White");  
		Dog d = (Dog)animal1;  
		
		
		URL u =  new URL("hello");
		URLConnection c =u.openConnection();
		HttpURLConnection h=(HttpURLConnection)c;

	}

}
