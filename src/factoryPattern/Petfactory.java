package factoryPattern;

public class Petfactory {
 public Pet getPet(String petType) {
	 Pet pet = null;
	 if("bark".equals(petType))
		 pet = new Dog();
	 else if("duck".equals(petType))
		 pet = new Duck();
	 return pet;
	
}
}
