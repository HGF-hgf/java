class Student {
    private String name, id, group, email;

    public void setName(String _name) {
        this.name = _name;
    }

    public String getName() {
        return name;
    }

    public void setId(String _id) {
        this.id = _id;
    }

    public String getId() {
        return id;
    }

    public void setGroup(String _group) {
        this.group = _group;
    }

    public String getGroup() {
        return group;
    }

    public void setEmail(String _email) {
        this.email = _email;
    }

    public String getEmail() {
        return email;
    }

    public String getInfo() {
        String S = name + " - " + id + " - " + group + " - " + email;
        return S;
    }

    Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    Student(String _name, String _id, String _email) {
        this.name = _name;
        this.id = _id;
        this.email = _email;
        this.group = "K62CB";
    }

    Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;

    }
}
