import java.util.Scanner;

// Import your library
// Do not change the name of the Solution
public class StudentManagement {
    private Student[] list;
    private int num;

    private void sortStudent() {
        for (int i = 0; i < num - 1; ++i) {
            for (int j = i + 1; j < num; ++j) {
                if (list[i].getGroup().compareTo(list[j].getGroup()) < 0) {
                    Student temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    public StudentManagement() {
        list = new Student[100];
        num = 0;
    }

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public void addStudent(Student s) {
        list[num] = s;
        ++num;
    }

    public String studentsByGroup() {
        if (num == 0) return "No";
        sortStudent();
        StringBuilder res = new StringBuilder();
        String curr = list[0].getGroup();
        Student currStudent;
        res.append(curr).append("\n");

        for (int i = 0; i < num; ++i) {
            currStudent = list[i];
            if (!currStudent.getGroup().equals(curr)) {
                curr = currStudent.getGroup();
                res.append(curr).append("\n");
            }
            res.append(currStudent.getInfo()).append("\n");
        }
        return res.toString();
    }

    public void removeStudent(String id) {
        int index = -1;
        for (int i = 0; i < num; ++i) {
            if (list[i].getId().equals(id) && list[i] != null)
                index = i;
        }
        for (int i = index; i < num - 1; ++i) {
            list[i] = list[i + 1];
        }
        --num;
    }
}

































