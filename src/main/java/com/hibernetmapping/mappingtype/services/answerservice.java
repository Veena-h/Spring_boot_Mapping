package com.hibernetmapping.mappingtype.services;

import com.hibernetmapping.mappingtype.entities.Answer;

import java.util.List;

public interface answerservice
{
    public Answer createans(Answer a);
    public List<Answer> getAllAnswer();
}
