class StudentGrade {
    String name;
    int marks;
    static int passingMarks = 40;

    void grade() {
        String g;

        if (marks >= 90) g = "A+";
        else if (marks >= 80) g = "A";
        else if (marks >= 70) g = "B";
        else if (marks >= passingMarks) g = "C";
        else g = "Fail";

        System.out.println("Name: " + name);
        System.out.println("Grade: " + g);
    }

    public static void main(String[] args) {
        StudentGrade s = new StudentGrade();
        s.name = "Aman";
        s.marks = 85;
        s.grade();
    }
}

Name: Aman
Grade: A