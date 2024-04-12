package com.hibernetmapping.mappingtype.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class Question
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private String question;
    @OneToOne()
    Answer answer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
}
