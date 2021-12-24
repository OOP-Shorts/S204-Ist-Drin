public class IstDrin {

    private static void includes(String[] array, String target) {
        for (String s : array) {
            if (s.equals(target)) {
                System.out.println("Ist drin");
                return;
            }
        }
    }

    public static void main(String[] args) {
        String[] courses = {"OOP", "EIMI", "Mathe"};
        includes(courses, "OOP");
    }
}
