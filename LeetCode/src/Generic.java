import java.util.*;
import java.util.stream.Collectors;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}
 class HackerRankOne
{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            testCases--;
        }
     studentList=studentList
                .stream()
                .sorted(Comparator.comparingDouble(Student::getCgpa)
                        .reversed()
                        .thenComparing(Student::getFname)
                        .thenComparing(Student::getId)
                ).collect(Collectors.toList());
       studentList.sort((a, b) -> {
           if (a.getCgpa() == b.getCgpa()) {
               if (a.getFname() == b.getFname()) {
                   return a.getId() - b.getId();
               } else return a.getFname().compareTo(b.getFname());
           }
           return (int) (a.getCgpa() - b.getCgpa());
       });

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}



