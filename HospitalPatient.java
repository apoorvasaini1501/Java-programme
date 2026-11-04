import java.util.*;

class HospitalPatientDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        HashSet<String> ids = new HashSet<>();

        names.add("Aman");
        names.add("Rahul");
        names.add("Priya");

        ids.add("P101");
        ids.add("P102");
        ids.add("P103");

        names.remove("Rahul");
        ids.remove("P102");

        System.out.println("Patients: " + names);
        System.out.println("IDs: " + ids);
        System.out.println("Search Aman: " + names.contains("Aman"));
        System.out.println("Total: " + names.size());
    }
}