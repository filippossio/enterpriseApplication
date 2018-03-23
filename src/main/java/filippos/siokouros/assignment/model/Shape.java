package filippos.siokouros.assignment.model;

public class Shape {
    private String a;
    private String b;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    private String question;
    public Shape(String a, String b, String shape, String color) {
        this.a = a;
        this.b = b;
        this.shape = shape;
        this.color = color;
    }
    public Shape(String question){
        this.question =question;
    }

    private String shape;
    private String color;



    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
