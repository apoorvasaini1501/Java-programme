class StudentMarks {
    public static void main(String[] args) {

        int[][] marks = {
            {80, 75},
            {90, 85, 88},
            {70, 65, 72, 80}
        };

        for (int i = 0; i < marks.length; i++) {

            System.out.print("Student " + (i + 1) + ": ");

            for (int j = 0; j < marks[i].length; j++)
                System.out.print(marks[i][j] + " ");

            System.out.println();
        }
    }
}




Student 1: 80 75
Student 2: 90 85 88
Student 3: 70 65 72 80