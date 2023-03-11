import java.util.Objects;

public class Java35 {
    public static void main(String[] args) {
        Student s1 = new Student("Tinkesh", 94243932,20);
        Student s2 = new Student("Tinkesh", 94243932, 20);
        Student s3 = new Student("Adarsh", 94243933,12);
        int a = 1;
        int b = 1;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
class Student {

    private String name;
    private long phoneNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return phoneNumber == student.phoneNumber && age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber, age);
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", phoneNumber=" + phoneNumber +
//                ", age=" + age +
//                '}';
//    }

    private int age;
    Student(){
        System.out.println("This will");
    }
    Student(String name , long phoneNumber , int age){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
