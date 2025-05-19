import java.io.*;

class Student {
    int marks;
    boolean check(int i){
        if(i<0){
            return false;          
        }
        else
            return true;   
    }

    Student(int marks) throws Exception{
        if(check(marks)){
            this.marks=marks;
        }
        else{
            throw new Exception("Negative Marks");
        }
            
    }
}

class ExceptionDemo{
    public static void main(String[] args){
        System.out.println("HI");
          
        try{
            Student s2=new Student(100);
            System.out.println(s2.marks);
            Student s1=new Student(-1);
            System.out.println(s1.marks);
            
        }catch(Exception e){
            System.out.println("Error Occured "+e.getMessage());
        }
          
        
        System.out.println("Done!");
        


    }
}
