package testdata;

public class Student implements Comparable<Student> {

	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Student other) {
		return this.name.compareTo(other.getName());
	}

	@Override
	public String toString() {
		return "{name=" + name + ", age=" + age + "}";
	}
}
