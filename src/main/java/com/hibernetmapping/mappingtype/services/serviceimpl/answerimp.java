package com.hibernetmapping.mappingtype.services.serviceimpl;

import com.hibernetmapping.mappingtype.entities.Answer;
import com.hibernetmapping.mappingtype.repositories.answerrepo;
import com.hibernetmapping.mappingtype.services.answerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class answerimp implements answerservice
{

    @Autowired
    answerrepo ans;
    @Override
    public Answer createans(Answer a) {
        return ans.save(a);
    }

    @Override
    public List<Answer> getAllAnswer() {
        return ans.findAll();
    }


}
