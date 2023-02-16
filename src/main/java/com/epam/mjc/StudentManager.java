package com.epam.mjc;


public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) {
    return Student.getValueOf(studentID);
  }
  
      public static class StudentManager {
        public StudentManager(){
        }
        public Student find(long studentID) throws IllegalArgumentException{
            if(Student.getValueOf(studentID)==null){
                throw new IllegalArgumentException("Could not find student with ID", studentID);
            }
            return Student.getValueOf(studentID);
        }
    }

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();

    for (int i = 0; i < IDs.length; i++) {
      Student student = manager.find(IDs[i]);
      System.out.println("Student name " + student.getName());
    }

  }
     public static class IllegalArgumentException extends Exception{
        public IllegalArgumentException(String message,long ID){
            super(message +" "+ ID);
        }
    }
}
