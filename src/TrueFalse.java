import java.util.Scanner;

public class TrueFalse extends Question {


    public TrueFalse(String query, String answer, int scoreValue, String type){
        super(query, answer, scoreValue, type);
    }

    @Override
    public void askQuestion() {
        System.out.println(this.getQuery() + this.getScoreValue() + "pts" + " (T/F)");
    }

}