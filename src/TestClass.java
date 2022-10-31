import com.ibm.icu.text.RuleBasedNumberFormat;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class TestClass {
    public static void main(String[] args) {
        String str = "HELLO HILLEL";
        String str2 = new String("bcvbcvb");
        System.out.println(str);

        Cat myCat = new Cat();
        myCat.setName("Murzik");
        myCat.setAge(-3);

        System.out.println(myCat.getName());

        Cat myCat2 = myCat;
        myCat2.setName("Vasiliy");

        System.out.println("==========================");
//        System.out.println(myCat.getName());
//        System.out.println(myCat2.getName());
//        System.out.println(myCat.getAge());
        Dog someDog = new Dog();

        myCat.sound();
        someDog.sound();

        Animal[] animals = {new Dog(), new Cat(), new Dog(), new Cat(), new Cat()};
        for (int i = 0; i < animals.length; i++) {
            animals[i].sound();
        }

        Animal an = new Dog();
        an.setName("Bobik");
        an.setAge(5);
        Animal an2 = new Dog("Bobik", 5);

        System.out.println(an.equals(an2));

//        Animal aaa = new Animal();

        List<Animal> animalsArr = new LinkedList<>();
        animalsArr.add(new Dog());
        animalsArr.add(new Cat());
        animalsArr.stream();

        Calculator myCalc = new Calculator();
        myCalc.ccc();
        Calculator.sum(123, 467);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        long number = 787878787;

        RuleBasedNumberFormat ruleBasedNumberFormat = new RuleBasedNumberFormat( new Locale("EN", "US"), RuleBasedNumberFormat.SPELLOUT );
        System.out.println(ruleBasedNumberFormat.format(number));







//        myCat.meow();
//        System.out.println(myCat.meow2());
//        myCat.thanks("fish");
//
//        System.out.println(myCat.isCurrentYearVisokos());
//
//        int[] arr2 = new int[8];
//
//        int[] arr = {12, 23, 44, 56, 566, 576, 8978, 9087};
//        int newNumber = 9987;
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        int[] newArr = new int[arr.length + 1];
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[i];
//        }
//
//        newArr[newArr.length - 1] = newNumber;
//
//        System.out.println("---------------------------");
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.println(newArr[i]);
//        }


//        long currTime = myCat.getUnixtime();
//        long newCurrTime = currTime + 10000;
//        System.out.println(currTime);
//        System.out.println(newCurrTime);
//        System.out.println("======================");
//        myCat.getUnixtime2();

//        int a = 123;
//        float b = 0.1f;
//        double c = 0.1;
//        long d = 1234;
//        short e = 123;
//        byte f = 127;
//
//        boolean g = true;
//        char h1 = 'a' + 1;
//        char h2 = 'a' - 32;
//        char h3 = 't' - 32;
//        System.out.println(h1);
//        System.out.println(h2);
//        System.out.println(h3);
    }
}
