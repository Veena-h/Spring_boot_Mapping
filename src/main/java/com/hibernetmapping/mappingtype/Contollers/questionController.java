package com.hibernetmapping.mappingtype.Contollers;


import com.hibernetmapping.mappingtype.entities.Answer;
import com.hibernetmapping.mappingtype.entities.Question;
import com.hibernetmapping.mappingtype.services.serviceimpl.questionimp;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    @DeleteMapping("/delete/{id}")
    public Integer delete(@PathVariable Integer id)
    {
        return imp.deleteQuestionById(id);
    }


    @PostConstruct()
    public Question bydefault()
    {
        Question q1=new Question();
        q1.setQuestion("what is hibernate?");
        return imp.create(q1);
    }


}
