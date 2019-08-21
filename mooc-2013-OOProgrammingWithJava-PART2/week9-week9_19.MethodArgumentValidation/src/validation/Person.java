package validation;
import java.lang.IllegalArgumentException;
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) throws Exception {
        if (name == null)
            throw new IllegalArgumentException("test");
        if (name.isEmpty() || name.length() > 40)
            throw new IllegalArgumentException("test");
        if (age > 120 || age < 0)
            throw new IllegalArgumentException("test");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}
