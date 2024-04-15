package casting;

public class Animal {
	
	String color; 
	Animal()
	{
		
	}
	Animal(String color){  
	this.color = color;  
	}  
	void eat(String name) {  
	System.out.println(name + " is eating .....");  
	}  
	void show(String name) {  
	System.out.println(name + " is of " + color + " Color");  
	}  

}
