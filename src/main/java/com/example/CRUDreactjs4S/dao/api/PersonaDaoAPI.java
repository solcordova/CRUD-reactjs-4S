package com.example.CRUDreactjs4S.dao.api;

import com.example.CRUDreactjs4S.model.Persona;

import org.springframework.data.repository.CrudRepository;

public interface PersonaDaoAPI extends CrudRepository<Persona,Long> {
}
