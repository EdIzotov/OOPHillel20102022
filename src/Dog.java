public class Dog extends Animal {
    private String poroda;

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public Dog(String name, int age) {
        super(name, age);
    }
    public Dog() {
        super();
    }
    public Dog(String name, int age, String poroda) {
        super(name, age);
        this.poroda = poroda;
    }
    @Override
    public void sound() {
        System.out.println("Hav!");
    }

    @Override
    public void xxx() {

    }
}
