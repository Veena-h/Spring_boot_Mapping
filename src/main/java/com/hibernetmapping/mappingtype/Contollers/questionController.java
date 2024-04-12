package com.hibernetmapping.mappingtype.Contollers;


import com.hibernetmapping.mappingtype.entities.Question;
import com.hibernetmapping.mappingtype.services.serviceimpl.questionimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/question")
public class questionController
{

    @Autowired
    questionimp imp;

    @PostMapping("/q1")
    public Question create(@RequestBody Question q)
    {
        return  imp.create(q);
    }

}
