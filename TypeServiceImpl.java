
package com.maram.Makeuppp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maram.Makeuppp.entities.Type;
import com.maram.Makeuppp.repos.TypeRepository;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeRepository typeRepository;

    @Override
    public Type saveType(Type t) {
        return typeRepository.save(t);
    }

    @Override
    public Type updateType(Type t) {
        return typeRepository.save(t);
    }

    @Override
    public void deleteType(Type t) {
        typeRepository.delete(t);
    }

    @Override
    public void deleteTypeById(Long id) {
        typeRepository.deleteById(id);
    }

    @Override
    public Type getType(Long id) {
        return typeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Type> getAllTypes() {
        return typeRepository.findAll();
    }
}
