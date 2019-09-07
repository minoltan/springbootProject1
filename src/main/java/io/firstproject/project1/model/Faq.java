package io.firstproject.project1.model;



import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;


//This is the first class that we create
//@Document creates each data table in mongodb
@Document("faq")
public class Faq {

    @Id
    private String id;
    private String Question;
    private String Answer;

    public Faq() {

    }



    public Faq(String question, String answer) {

        Question = question;
        Answer = answer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }
}
