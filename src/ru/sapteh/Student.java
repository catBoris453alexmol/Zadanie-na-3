package ru.sapteh;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String patronomic;
    private String dateBirthDay;
    private String special;
    private int course;
    private int group;

    public Student(int id, String lastName, String firstName, String patronomic, String dateBirthDay, String special, int course, int group){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronomic = patronomic;
        this.dateBirthDay = dateBirthDay;
        this.special = special;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronomic() {
        return patronomic;
    }

    public String getDateBirthDay() {
        return dateBirthDay;
    }

    public String getSpecial() {
        return special;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPatronomic(String patronomic) {
        this.patronomic = patronomic;
    }

    public void setDateBirthDay(String dateBirthDay) {
        this.dateBirthDay = dateBirthDay;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString(){
        return String.format("%d %s %s %s %s %s %s %d %d ",getId(),getLastName(),getFirstName(),getPatronomic(),getDateBirthDay(),getSpecial(),getCourse(),getGroup());
    }
}
