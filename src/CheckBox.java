import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckBox extends Question {

    private HashMap<Character, String> choices;
    public CheckBox(String query, HashMap<Character, String> choices, String [] answer, int scoreValue, String type) {
        super(query,answer, scoreValue, type);
        this.choices = choices;
    }

    @Override
    public void askQuestion() {
        System.out.println(this.getQuery() + " " + this.getScoreValue() + "pts");
        HashMap<Character, String> check = new HashMap<>();
        for(Map.Entry<Character, String> entry: this.choices.entrySet()){
            System.out.println(entry.getKey() + ") " + entry.getValue());
        }
    }

}
