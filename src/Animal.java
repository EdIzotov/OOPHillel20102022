import java.util.Objects;

public abstract class Animal implements Predator {
    private int age;
    private String name;
    public static final String aaa = "Hello";

    public Animal(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sound();

    public void sound(String someStr) {}
//    public void sound(int aaa) {}
//    public void sound(int aaa, String bbb) {}
//    public void sound(String bbb, int aaa) {}


    @Override
    public String toString() {
        return "{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public abstract void xxx();

    @Override
    public void hunt() {

    }
}
