package exercises;

import java.util.*;

public class Smurf {

	private String name;
	private static Map <String,Smurf> family = new HashMap();

	public static Smurf createSmurf(String name) {
		Smurf memberFamily ;
		if (family.containsKey(name)) {
			memberFamily =  family.get(name);
		} else	{
			
			System.out.println("Creating " + name + " Smurf");
			memberFamily =  new Smurf(name);
			family.put(name, memberFamily);
		}
		return memberFamily;
	}

	private Smurf(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

}
