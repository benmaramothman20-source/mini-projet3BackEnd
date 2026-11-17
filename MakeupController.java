package com.maram.Makeuppp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.maram.Makeuppp.entities.makeuppp;
import com.maram.Makeuppp.service.MakeupppService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class MakeupController {

    @Autowired
    MakeupppService makeupppService;

    @RequestMapping(value = "/makeupsByName/{nom}", method = RequestMethod.GET)
    public List<makeuppp> findByNomMakeupContaining(@PathVariable("nom") String nom) {
        return makeupppService.findByNomMakeup(nom);
    }
}