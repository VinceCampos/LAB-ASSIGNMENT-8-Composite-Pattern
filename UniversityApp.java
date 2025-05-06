public class UniversityApp {
    public static void main(String[] args) {
        // Students
        Student s1 = new Student("Lester", "2001", 15000);
        Student s2 = new Student("Ysac", "2002", 20000);
        Student s3 = new Student("Renard", "2003", 30000);

        // Teachers
        Teacher t1 = new Teacher("Professor Benilde", "Business Law", 35000);
        Teacher t2 = new Teacher("Professor Ramon", "Income Tax", 40000);

        // Departments
        Department faDept = new Department("Financial Accounting");
        faDept.add(t1);
        faDept.add(s1);
        faDept.add(s2);

        Department auditDept = new Department("Auditing");
        auditDept.add(t2);
        auditDept.add(s3);

        // College of Informatics and Computing Studies
        College cicsCollege = new College("College of Accountancy");
        cicsCollege.add(faDept);
        cicsCollege.add(auditDept);

        // Display Details
        System.out.println("Displaying University Structure:");
        cicsCollege.displayDetails();

        // Total Students
        System.out.println("\nTotal Students: " + cicsCollege.getStudentCount());

        // Total Budget
        System.out.println("Total Budget: " + cicsCollege.getBudget());
    }
}