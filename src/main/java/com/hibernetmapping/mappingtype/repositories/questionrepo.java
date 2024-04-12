package com.hibernetmapping.mappingtype.repositories;

import com.hibernetmapping.mappingtype.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface questionrepo  extends JpaRepository<Question,Integer>
{
}
