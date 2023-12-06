package oop2_week4;

/**
 *
 * @author User
 */
public class BuildTest {

    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setId(20302);
        std1.setName("aboalrod");
        std1.setGpa(72.34);
        Student s2 = new Student(20030, "moauya", 95.2);
        Student s3 = new Student();

        s3.withGpa(65).withId(243564).withName("qusai");
        System.out.println(std1);
        System.out.println(s2);
        System.out.println(s3);
    }

}
