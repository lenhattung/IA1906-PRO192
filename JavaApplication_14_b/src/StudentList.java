
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tungi
 */
public class StudentList extends ArrayList<Student> {
    public void printAll(){
        for (Student st : this) {
            System.out.println(st);
        }
    }
    
    public void addStudent(Student st){
        this.add(st);
    }
    
    public void deleteStudent(Student st){
        this.remove(st);
    }
    
    public void printPassedStudent(){
        for (Student st : this) {
            if(st.getGpa()>=5){
                System.out.println(st);
            }
        }
    }
    
    public Student searchByName(String name){
        
// Your code here
        return null;
    }
}
