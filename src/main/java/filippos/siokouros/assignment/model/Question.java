package filippos.siokouros.assignment.model;

public class Question {
    private String question;
    private int a;
    private int b;

    public Question(String question) {
        this.question = question;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
