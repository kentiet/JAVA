package chap07;

/**
 * Represents a question (and its answer).
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Question implements Complexity {

    /** Stored question. */
    private String question;

    /** Stored answer. */
    private String answer;

    /** Complexity level for question. */
    private int complexityLevel;

    /**
     * Constructor: Sets up the question with a default complexity.
     * @param query The question
     * @param result The answer
     */
    public Question(String query, String result) {
        question = query;
        answer = result;
        complexityLevel = DEFAULT_COMPLEXITY;
    }

    /**
    * Sets the complexity level for this question.
    * @param level The complexity of the question
    */
    public void setComplexity(int level) {
        complexityLevel = level;
    }

    /**
    * Returns the complexity level for this question.
    * @return The complexity
    */
    public int getComplexity() {
        return complexityLevel;
    }

    /**
    * Returns the question.
    * @return The question
    */
    public String getQuestion() {
        return question;
    }

    /**
    * Returns the answer to this question.
    * @return The answer
    */
    public String getAnswer() {
        return answer;
    }

    /**
    * Returns true if the candidate answer matches the answer.
    * @param candidateAnswer The user's answer
    * @return true if the answer is correct
    */
    public boolean answerCorrect(String candidateAnswer) {
        return answer.equals(candidateAnswer);
    }

    /**
    * Returns this question (and its answer) as a string.
    * @return String containing question and answer on separate lines
    */
    public String toString() {
        return question + "\n" + answer;
    }
}
