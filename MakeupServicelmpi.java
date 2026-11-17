package com.maram.Makeuppp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.maram.Makeuppp.entities.makeuppp;
import com.maram.Makeuppp.repos.MakeupppRepository;


@Service
public class MakeupServicelmpi implements MakeupppService {
	
	//@Autowired
	private final MakeupppRepository MakeupppRepository;
	


	public MakeupServicelmpi(com.maram.Makeuppp.repos.MakeupppRepository makeupppRepository) {
		super();
		MakeupppRepository = makeupppRepository;
	}

	@Override
	public makeuppp saveMakeup(makeuppp p) {
		return MakeupppRepository.save(p);
		
	}

	@Override
	public makeuppp updateMakeup(makeuppp p) {
		 return MakeupppRepository.save(p);
	}

	@Override
	public void deleteMakeup(makeuppp p) {
		MakeupppRepository.delete(p);
		
	}

	@Override
	public void deleteMakeupById(Long id) {
		MakeupppRepository.deleteById(id);
		
	}

	@Override
	public makeuppp getMakeup(Long id) {
		return MakeupppRepository.findById(id).get();
	}

	@Override
	public List<makeuppp> getAllMakeups() {
		 return MakeupppRepository.findAll();
		
	}
	@Override
	public List<makeuppp> findByNomMakeup(String nom) {
	    return MakeupppRepository.findByNomMakeup(nom);
	}
	

}
