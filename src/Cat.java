import java.util.Calendar;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    public Cat() {
        super();
    }
    void meow() {
        System.out.println(getName() + " says Meow!!!");
    }
    String meow2() {
        meow();
        return getName() + " says Meow!!!";
    }

    void thanks(String food) {
        System.out.println(getName() + " thanks for " + food + " murrrs....");
    }

//    long getUnixtime() {
//        return System.currentTimeMillis();
//    }
//
//    void getUnixtime2() {
//        System.out.println(System.currentTimeMillis());
//    }

    int summ(int a, int b) {
        return a + b;
    }

    boolean isCurrentYearVisokos() {
        Calendar calendar = Calendar.getInstance();
        int todayYear = calendar.get(Calendar.YEAR);
        if (todayYear % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public void sound() {
        System.out.println("Meow!");
    }

    @Override
    public void xxx() {

    }
}
