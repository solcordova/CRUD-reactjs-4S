package com.example.CRUDreactjs4S.service.impl;


import com.example.CRUDreactjs4S.commons.GenericServiceImpl;
import com.example.CRUDreactjs4S.dao.api.PersonaDaoAPI;
import com.example.CRUDreactjs4S.model.Persona;
import com.example.CRUDreactjs4S.service.api.PersonaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaServiceAPI {

    @Autowired
    private PersonaDaoAPI personaDaoAPI;

    @Override
    public CrudRepository<Persona, Long> getDao() {
        return personaDaoAPI;
    }

}
