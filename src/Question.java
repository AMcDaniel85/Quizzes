public abstract class Question {

    private String query;
    private int scoreValue;
    private Object correctAnswer;
    public String type;


    public Question (String query, Object correctAnswer, int scoreValue, String type){
        this.query = query;
        this.correctAnswer = correctAnswer;
        this.scoreValue = scoreValue;
        this.type = type;
    }

    public String getQuery() { return query; }

    public abstract void askQuestion();

    public Object getAnswers() { return correctAnswer;};

    public int getScoreValue() {
        return scoreValue;
    }

    public String getType() { return type; }

}
