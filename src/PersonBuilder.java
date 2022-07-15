public class PersonBuilder implements PersonBuildable {

    private String name;
    private String surname;
    private String address;
    private int age;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) throw new IllegalArgumentException("Не правильный возраст");
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalStateException {
        if ((this.name != null) && (this.surname != null)) {
            if (this.age == 0) {
                return new Person(this.name, this.surname);
            } else return new Person(this.name, this.surname, this.age);
        } else throw new IllegalStateException("Не достаточно данных");
    }

}
