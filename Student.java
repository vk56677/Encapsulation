// ============================================
// Encapsulation Example ~ Student Class
// Author ~ Vikas Kumar
// Topic ~ OOP ~ Encapsulation
// ============================================

class Student {

    // Private fields ~ Direct access blocked
    private String name;
    private int result;
    private char classSection;

    // Setter ~ Set student name
    public void setName(String n) {
        this.name = n;
    }

    // Setter ~ Set result with validation (0-100 only)
    public void setResult(int r) {
        if (r >= 0 && r <= 100) {
            result = r;
        }
    }

    // Setter ~ Set class section
    public void setClassSection(char c) {
        this.classSection = c;
    }

    // Getter ~ Return student name
    public String getName() {
        return name;
    }

    // Getter ~ Return result
    public int getResult() {
        return result;
    }

    // Getter ~ Return class section
    public char getClassSection() {
        return classSection;
    }

    // Main method ~ Program starts here
    public static void main(String[] args) {

        // Creating Student object
        Student s1 = new Student();

        // Setting values using setters
        s1.setName("Vikas");
        s1.setResult(80);
        s1.setClassSection('B');

        // Printing values using getters
        System.out.println("Student name : " + s1.getName());
        System.out.println("Student result : " + s1.getResult());
        System.out.println("Student class : " + s1.getClassSection());
        System.out.println("Vikas ki wife numi ");
    }
}
