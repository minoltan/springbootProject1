package io.firstproject.project1.model;



import org.springframework.data.mongodb.core.mapping.Document;

import static javax.persistence.GenerationType.AUTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//This is the first class that we create
//@Document creates each data table in mongodb
//@Document("faq")
@Entity
@Table(name="faq")
public class Faq {

    @Id
    @Column
    private String id;
    @Column
    private String Question;
    @Column
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
