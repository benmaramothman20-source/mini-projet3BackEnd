
package com.maram.Makeuppp.service;

import java.util.List;
import com.maram.Makeuppp.entities.Type;

public interface TypeService {

    Type saveType(Type t);

    Type updateType(Type t);

    void deleteType(Type t);

    void deleteTypeById(Long id);

    Type getType(Long id);

    List<Type> getAllTypes();
}
