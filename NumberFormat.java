class NumberFormatDemo {
    public static void main(String[] args) {
        String s = "ABC";

        try {
            int n = Integer.parseInt(s);
            System.out.println("Number = " + n);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}

