public class Professor {
    int professorID;
    String name;
    int age;
    String grade;

    public Professor(int professorID, String name, int age, String grade) {
        this.professorID = professorID;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void manageSugject(Subject subject){
        SubjectParticipates<Professor> list = new SubjectParticipates<>();
        list.add(this);
    }

    public void run(Subject subject){

    }
}
