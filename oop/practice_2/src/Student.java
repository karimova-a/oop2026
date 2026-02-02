public class Student {
    private String studentName ; 
    private String studentId ;
    private int yearOfStudy ;

    public Student(String studentName, String studentId){
        this.studentName = studentName ;
        this.studentId = studentId ;
        this.yearOfStudy = 1 ;
    }

    public String getName() { return studentName; }
    public String getId() { return studentId; }
    public int getYear() { return yearOfStudy; }

    public void incrementYear(){
        yearOfStudy++ ;
    }

    public static void main(String[] args){
        Student student1 = new Student("Aigerim", "24B031834") ;
        System.out.println("Initial info: ") ;
        System.out.println("Student Name: " + student1.getName()) ;
        System.out.println("Student ID: " + student1.getId()) ;
        System.out.println("Student Year: " + student1.getYear()) ;

        student1.incrementYear() ;

        System.out.println("Student Year after change: " + student1.getYear()) ;

    }

}

