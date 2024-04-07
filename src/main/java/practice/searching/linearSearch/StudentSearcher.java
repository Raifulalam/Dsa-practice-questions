package practice.searching.linearSearch;

public class StudentSearcher {
    public static void main(String[] args) {
        String[] students = new String[]{"raman", "raju", "rohan", "payal", "priyanka", "preeti", "sonia", "samradhi"};
        StudentSearcher studentSearcher = new StudentSearcher();
        System.out.println("studentSearcher.searcher(students,\"payal\") = " + studentSearcher.searcher(students, "payal"));
    }

    int searcher(String[] students, String name) {
        for (int index = 0; index < students.length; index++) {
            if (students[index].equals(name)) {
                return index;
            }
        }
        return -1;
    }
}
