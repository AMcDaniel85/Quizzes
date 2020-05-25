import java.util.ArrayList;
import java.util.HashMap;

public class QuizRunner {
    public static void main(String[] args){

        //Multiple choice
        HashMap<Character, String> multChoice1 = new HashMap<>();
        multChoice1.put('a', "Ravenclaw");
        multChoice1.put('b', "Hufflepuff");
        multChoice1.put('c', "Gryffindor");
        multChoice1.put('d', "Slytherin");
        MultipleChoice q1 = new MultipleChoice("Which Hogwarts house is the best?", multChoice1, "c", 5, "Multiple Choice");

        HashMap<Character, String> multChoice2 = new HashMap<>();
        multChoice2.put('a', "Monster");
        multChoice2.put('b', "Rockstar");
        multChoice2.put('c', "Amp");
        multChoice2.put('d', "Full Throttle");
        MultipleChoice q2 = new MultipleChoice("Which energy drink is the best?", multChoice2, "a", 5, "Multiple Choice");

        //True or False
        TrueFalse q3 = new TrueFalse("French Bulldogs are the cutest.", "t", 2, "True/False");
        TrueFalse q4 = new TrueFalse("iPhone is the best smartphone.", "t", 2, "True/False");

        //Checkbox
        HashMap<Character, String> checkbox1 = new HashMap<>();
        checkbox1.put('a', "Allison is the smartest");
        checkbox1.put('b', "Allison is always right");
        checkbox1.put('c', "Allison is great at math");
        checkbox1.put('d', "Allison is the bomb");
        String [] answer = new String[] {"a", "b", "d"};
        CheckBox q5 = new CheckBox("Which of the Following best describe Allison?", checkbox1, answer, 10, "Checkbox");

        HashMap<Character, String> checkbox2 = new HashMap<>();
        checkbox2.put('a', "Imo's");
        checkbox2.put('b', "Papa John's");
        checkbox2.put('c', "Pizza Hut");
        checkbox2.put('d', "Domino's");
        String [] answer2 = new String[] {"a", "c"};
        CheckBox q6 = new CheckBox("Who makes the best pizza?", checkbox2, answer2, 10, "Checkbox");


        Quiz quiz = new Quiz();
        quiz.addQuestion(q5);
        quiz.addQuestion(q6);
        quiz.addQuestion(q3);
        quiz.addQuestion(q4);
        quiz.addQuestion(q1);
        quiz.addQuestion(q2);
        quiz.runQuiz();

    }
}
