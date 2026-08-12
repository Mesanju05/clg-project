import java.util.*;

class studentcgpa {

     int id;
     String name;
    double cgpa;

    public studentcgpa(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<studentcgpa> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            students.add(new studentcgpa(id, name, cgpa));
        }

        students.sort(
            Comparator.comparingDouble(studentcgpa::getCgpa)
                      .reversed()
                      .thenComparing(studentcgpa::getName)
                      .thenComparingInt(studentcgpa::getId)
        );

        for (studentcgpa student : students) {
            System.out.println(student.getName());
        }

        sc.close();
    }
}








