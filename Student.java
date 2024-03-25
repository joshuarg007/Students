class Student{

     
    private int rollNo; // Roll Number of Student
    private String name; // Student Name
    private String address; // Student Address

    // Constructor to initialize allvariables
    public Student(String name, int rollNo, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    // Constructor to initialize rollNumber and name
    public Student(String name, int rollNo) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Getter for rollNo
    public int getRollNo() {
        return rollNo;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    // toString method for easy printing of student details
    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}