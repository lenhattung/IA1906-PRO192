/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class StudentMS_1 {
    Student[] studentList = new Student[10000];
    int numberOfStudent = 0;

    public StudentMS_1() {
        
    }
    
    public void addStudent(Student st){
        this.studentList[numberOfStudent] = st;
        numberOfStudent++;
    }
    
    public void deleteStudent(Student st){
        int index = -1;
        for (int i = 0; i < numberOfStudent; i++) {
            if(this.studentList[i].equals(st)){
                index = i;
                break;
            }
        }
        if(index>=0){
            for (int i = index; i < numberOfStudent-1; i++) {
                this.studentList[i] = this.studentList[i+1];
            }
        }
        numberOfStudent--;
    }
    
    
    public void printAll(){
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println(studentList[i]);
        }
    }
}
