package factoryPattern;

public class SampleFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Petfactory factory = new Petfactory();
Pet pet = factory.getPet("bark");
//factory.getPet("duck");
System.out.println(pet.speak());

	}

}
