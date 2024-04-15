package com.hibernetmapping.mappingtype.services.serviceimpl;

import com.hibernetmapping.mappingtype.entities.Question;
import com.hibernetmapping.mappingtype.services.questionservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class questionimp implements questionservice
{

    @Autowired
    com.hibernetmapping.mappingtype.repositories.questionrepo questionrepo1;


    @Override
    public Question create(Question q) {
        return questionrepo1.save(q);
    }

    @Override
    public Integer deleteQuestionById(Integer i) {
       Integer i1= questionrepo1.deleteQuestionById(i);
       if(i==1)
       {
           return 1;
       }else
       {
           return  0;
       }
    }
}
