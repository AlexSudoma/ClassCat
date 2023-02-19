package sample;

public class Main {

	public static void main(String[] args) {

		Cat cat1 = new Cat();

		cat1.setName("Barsik");
		cat1.setColor("Black");
		cat1.setWeight(4);

		System.out.println(cat1.getName());
		System.out.println(cat1.meow());

		Cat cat2 = new Cat("Umka", 5, "White");

		System.out.println(cat1);
		System.out.println(cat2);

	}

}
  