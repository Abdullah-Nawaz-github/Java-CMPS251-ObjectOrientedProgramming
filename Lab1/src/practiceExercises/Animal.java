package practiceExercises;

public abstract class Animal {
	private String name;
	private double weight;
	private int age;

	public Animal(String name, double weight, int age) {
		this.name = name;
		this.weight = weight;
		this.age = age;
	}

	public abstract boolean eats(Animal a);
}