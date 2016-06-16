package ex2;

public class Person {

	String firstName;
	String lastName;
	String cidade;
	int age;

	public Person(String firstName, String lastName, String cidade, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cidade = cidade;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}