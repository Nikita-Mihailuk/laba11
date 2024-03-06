import java.util.Scanner;

class Person{
    private final int age;
    public String fio;
    public String telephone;

    Person(int age, String fio, String telephone){
        this.age = age;
        this.fio = fio;
        this.telephone = telephone;
    }

    public int getAge() { return this.age; }

}

class Student extends Person{
    public int course;
    public String faculty;
    private int date;


    Student(int age, String fio, String telephone, int course, String faculty, int date){
        super(age, fio, telephone);
        this.course = course;
        this.faculty = faculty;
        this.date = date;

    }

    public int getDate(){ return this.date; }

    public void displayInfo(Student student){
        System.out.println("Возраст : " + student.getAge() + "\nФИО: " + fio + "\nТелефон: " + telephone + "\nКурс: " + course + "\nФакультет: " + faculty + "\nГод поступления: " + student.getDate());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Student[] students = new Student[3];
        students[0] = new Student(16,"Иванов Иван Иванович", "555-1234",4,"Информационные технологии", 2015);
        students[1] = new Student(20, "Петров Петр Петрович", "555-5678",1,"Информационные технологии",2021);
        students[2] = new Student(18, "Сидорова Анна Игоревна", "555-9012",3,   "Медицина",2006);

        System.out.println("ФИО и возраст всех студентов:");
        for( int i = 0; i < students.length; i++){
            System.out.println("ФИО: " + students[i].fio + " Возраст: " + students[i].getAge());
        }

        System.out.print ("Введите факультет: ");
        String f = in.nextLine();
        System.out.println("Студенты с заданным факультетом:\n");
        for (int i = 0; i < students.length; i++){
            if(students[i].faculty.equals(f)) students[i].displayInfo(students[i]);
        }

        System.out.print ("Введите год: ");
        int d = in.nextInt();
        System.out.println("Студенты, поступившие после заданного года:\n");
        for (int i = 0; i < students.length; i++){
            if(students[i].getDate() > d) students[i].displayInfo(students[i]);
        }
    }
}