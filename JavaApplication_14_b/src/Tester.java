/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Tester {

    public static void main(String[] args) {
        Student s1 = new Student("SE01", "Hoa Minzy", 10);
        Student s2 = new Student("SE02", "Xuan Hinh", 9);
        Student s3 = new Student("SE03", "Tuan Cry", 8);
        Student s4 = new Student("SE04", "Nguyen Van A", 4);

        StudentMS_1 ms1 = new StudentMS_1();
        ms1.addStudent(s1);
        ms1.addStudent(s2);
        ms1.addStudent(s3);
        ms1.printAll();
        ms1.deleteStudent(s3);
        System.out.println("---");
        ms1.printAll();

        System.out.println("");
        System.out.println("");
        StudentList list = new StudentList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.printAll();
        System.out.println("---");
        list.remove(s3);
        list.printAll();
        System.out.println(list.contains(s1));
        
        System.out.println("");
        list.addStudent(s4);
        list.printPassedStudent();
    }
}
