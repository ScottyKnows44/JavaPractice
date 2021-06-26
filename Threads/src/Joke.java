public class Joke {
    public String Id;
    public String JokeQuestion;
    public String JokeAnswer;

    public Joke(String Id, String jokeAnswer, String jokeQuestion){
        this.Id = Id;
        this.JokeAnswer = jokeAnswer;
        this.JokeQuestion = jokeQuestion;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getJokeQuestion() {
        return JokeQuestion;
    }

    public void setJokeQuestion(String jokeQuestion) {
        JokeQuestion = jokeQuestion;
    }

    public String getJokeAnswer() {
        return JokeAnswer;
    }

    public void setJokeAnswer(String jokeAnswer) {
        JokeAnswer = jokeAnswer;
    }
}
