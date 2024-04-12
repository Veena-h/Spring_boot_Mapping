package com.hibernetmapping.mappingtype.Contollers;


import com.hibernetmapping.mappingtype.entities.Answer;
import com.hibernetmapping.mappingtype.services.serviceimpl.answerimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/answer")

public class answerContoller
{
    @Autowired
    answerimp imp;


    @PostMapping("/a1")
    public Answer create(@RequestBody Answer a)
    {
        return imp.createans(a);
    }
}
