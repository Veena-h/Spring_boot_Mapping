package com.hibernetmapping.mappingtype.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.util.List;

@Entity
@Data
public class Question
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String question;

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }
//    @OneToOne(mappedBy = "question" ,cascade = CascadeType.REMOVE)
//        Answer answer;


    @OneToMany(mappedBy = "question",cascade = CascadeType.REMOVE)
        @JsonBackReference
//            @JsonManagedReference
    List<Answer> answer;



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

//    public Answer getAnswer() {
//        return answer;
//    }
//
//    public void setAnswer(Answer answer) {
//        this.answer = answer;
//    }
}
