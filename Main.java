import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(2, "Stacey", "Aurora, Colorado"));
        students.add(new Student(3, "Chad", "Draper, Utah"));
        students.add(new Student(1, "John", "Lone Tree, Colorado"));
        students.add(new Student(5, "Justin", "Houston, Texas"));
        students.add(new Student(4, "George", "Denver, Colorado"));
        students.add(new Student(7, "Scott", "Lakewood, Colorado"));
        students.add(new Student(6, "Brian", "Lakewood, Colorado"));
        students.add(new Student(8, "Shanna", "Castle Rock, Colorado"));
        students.add(new Student(10, "Tanya", "Windsor, Colorado"));
        students.add(new Student(9, "Min Li", "Loveland, Colorado"));

        System.out.println("Original List:");
        System.out.println(students);

        System.out.println("\nSorted by Name:");
        SelectionSort.sort(students, new NameComparator());
        System.out.println(students);

        System.out.println("\nSorted by Roll Number:");
        SelectionSort.sort(students, new RollnoComparator());
        System.out.println(students);
    }
}