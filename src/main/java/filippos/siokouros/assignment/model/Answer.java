package filippos.siokouros.assignment.model;

public class Answer {
    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean ans) {
        this.correct = ans;
    }

    private boolean correct =false;

    public Answer(boolean answer){
        this.correct = answer;
    }

}
