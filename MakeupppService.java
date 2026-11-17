package com.maram.Makeuppp.service;
import java.util.List;
import com.maram.Makeuppp.entities.makeuppp;

public interface MakeupppService {
	 makeuppp saveMakeup(makeuppp m);
	 makeuppp updateMakeup(makeuppp m);
	 void deleteMakeup(makeuppp m);
	 void deleteMakeupById(Long id);
	 makeuppp getMakeup(Long id);
	 List<makeuppp> getAllMakeups();
	 List<makeuppp> findByNomMakeup(String nom);
	 
}
