package com.maram.Makeuppp;

import java.util.Date;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.maram.Makeuppp.entities.Type;
import com.maram.Makeuppp.entities.makeuppp;
import com.maram.Makeuppp.repos.MakeupppRepository;


@SpringBootTest
class MakeupppApplicationTests {
	@Autowired
	private MakeupppRepository MakeupppRepository;
	@Test
	public void testCreatemakeupp() {
	makeuppp prod = new makeuppp("Fond de teint",45.0,new Date());
	MakeupppRepository.save(prod);
	}
	 @Test
	 public void testFindmakeuppp()
	 {
	 makeuppp p = MakeupppRepository.findById(1L).get();
	 System.out.println(p);
	 }
	 
	 @Test
	 public void testUpdatemakeuppp()
	 {
	 makeuppp p = MakeupppRepository.findById(1L).get();
	 p.setPrix(1000.0);
	 MakeupppRepository.save(p);
	 System.out.println(p);
	 
	 }
	 @Test
	 public void testDeletemakeupp()
	 {
	 MakeupppRepository.deleteById(1L);
	 }
	 

     @Test
     public void testListerTousmakeuppp()
     {
    	 List<makeuppp> prods = MakeupppRepository.findAll();
    	 for (makeuppp p : prods)
    	 {
    		 System.out.println(p);
    	 }
     }
      @Test
      public void testfindByNomMakeupAndPrix()
      {
    	  List<makeuppp> prods = MakeupppRepository.findByNomMakeupAndPrix("rouge à lèvres", 25.0);
    	  for (makeuppp p : prods)
    	  {
    		  System.out.println(p);
    	  }
      }
      @Test
      public void testfindByType()
      {
          Type type = new Type();
          type.setIdType(1L);
          List<makeuppp> prods = MakeupppRepository.findByType(type);
          for (makeuppp p : prods)
          {
              System.out.println(p);
          }
      }
      @Test
      public void findByTypeIdType()
      {
          List<makeuppp> prods = MakeupppRepository.findByType_IdType(1L);
          for (makeuppp p : prods)
          {
              System.out.println(p);
          }
      }
      @Test
      public void testfindByOrderByNomProduitAsc()
      {
      List<makeuppp> prods =MakeupppRepository.findByOrderByNomMakeupAsc();
      for (makeuppp p : prods)
      {
      System.out.println(p);
      }
      }
      @Test
      public void testTrierProduitsNomsPrix()
      {
      List<makeuppp> prods = MakeupppRepository.trierProduitsNomsPrix();
      for (makeuppp p : prods)
      {
      System.out.println(p);
      }
      }


}


	 

	 





