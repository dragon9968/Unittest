package Function_Class;

public class Person {

	public String firstName;
	public String lastName;    

    public Person (String a, String b) {
        firstName = a;
        lastName = b;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

 
    public String toString() {
        return  firstName + " " + lastName;
    }
}
