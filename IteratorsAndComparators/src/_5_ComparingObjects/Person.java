package _5_ComparingObjects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }


    @Override
    public int compareTo(Person o) {
        if(this.name.equals(o.name)&&this.age==o.age&&this.town.equals(o.town)){
            return 0;
        }
        return 1;
    }
}
