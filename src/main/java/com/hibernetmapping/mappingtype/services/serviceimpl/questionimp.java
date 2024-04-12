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
}
