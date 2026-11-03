class StudentMarks {
    int marks1, marks2, marks3;
    static String universityName = "COER University";

    void average() {
        double avg = (marks1 + marks2 + marks3) / 3.0;
        System.out.println("Average: " + avg);
        System.out.println("University: " + universityName);
    }

    public static void main(String[] args) {
        StudentMarks s = new StudentMarks();
        s.marks1 = 80;
        s.marks2 = 90;
        s.marks3 = 70;
        s.average();
    }
}


Average: 80.0
University: COER University