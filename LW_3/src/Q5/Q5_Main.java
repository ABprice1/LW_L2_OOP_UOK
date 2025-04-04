package Q5;

class Course{
    private String courseName;
    private String courseCode;
    private Lecturer lecturer;

    public  void setCourseName(String courseName){this.courseName = courseName;}
    public  void setCourseCode(String courseCode) {this.courseCode = courseCode;}

    public  String getCourseName(){ return this.courseName;}
    public  String getCourseCode(){return this.courseCode;}

    public  void  setLecturer(Lecturer lecturer){this.lecturer = lecturer;}
    public  Lecturer getLecturer() {return this.lecturer;}
}

class Lecturer{
    private String lectureName;
    private String courseTeaching;

    public  void setLectureName(String lectureName){this.lectureName = lectureName;}
    public  void setCourseTeaching(String courseTeaching) {this.courseTeaching = courseTeaching;}
    public  String getLectureName(){ return this.lectureName;}
    public  String getCourseTeaching(){return this.courseTeaching;}
}

class Student{
    private String studentName;
    private String degreeName;
    private String courseFollowing;

    public  void setStudentName(String studentName){this.studentName = studentName;}
    public  String getStudentName(){ return this.studentName;}

    public  void setDegreeName(String degreeName){this.degreeName = degreeName;}
    public  String getDegreeName(){ return this.degreeName;}

    public  void setCourseFollowing(String courseFollowing){this.courseFollowing = courseFollowing;}
    public  String getCourseFollowing(){ return this.courseFollowing;}
}


public class Q5_Main {

    public static void main(String[] args) {

        Lecturer lecturer = new Lecturer();
        lecturer.setLectureName("Mr. John");
        lecturer.setCourseTeaching("Programming For Kids");

        Course course = new Course();
        course.setCourseCode("CT3456");
        course.setCourseName("Programming For Kids");
        course.setLecturer(lecturer);

        Student student = new Student();
        student.setStudentName("ABprice");
        student.setCourseFollowing("CT3456");
        student.setDegreeName("Computer Science");
    }


}
