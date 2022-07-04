import java.util.OptionalInt;

public class Person {

    protected final String name;
    protected final String surname;
    protected int age = -1;
    protected String address = null;

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.name = this.getName();
        personBuilder.surname = this.getSurname();
        if (this.hasAge()) personBuilder.age = this.getAge().getAsInt();
        if (this.hasAddress()) personBuilder.address = this.getAddress();
        return personBuilder;
    }


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public boolean hasAge() {
        if (this.age >= 0) {
            return true;
        } else return false;
    }

    public boolean hasAddress() {
        if (this.address != null) {
            return true;
        } else return false;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public OptionalInt getAge() {

        return OptionalInt.of(this.age);
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        this.age++;
    }

    @Override
    public String toString() {
        if (this.hasAge()) {
            if (this.hasAddress()) {
                return ("Name: " + this.getName() + ", Surname: " + this.getSurname() + ", Age: " + this.getAge().getAsInt() + ", Address: " + this.getAddress());
            } else {
                return ("Name: " + this.getName() + ", Surname: " + this.getSurname() + ", Age: " + this.getAge().getAsInt());
            }
        } else {
            if (this.hasAddress()) {
                return ("Name: " + this.getName() + ", Surname: " + this.getSurname() + ", Address: " + this.getAddress());
            } else {
                return ("Name: " + this.getName() + ", Surname: " + this.getSurname());
            }
        }

    }

    @Override
    public int hashCode() {
        return this.hashCode();
    }
}