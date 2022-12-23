public abstract class Person implements Comparable<Person> {
    private String fullName;
    private int age;
    Gender gender;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public int compareTo(Person p) {
        return this.getFullName().compareTo(p.getFullName());
    }

    public int compare(Person ivanPetrovich) {
        return 0;
    }

}
