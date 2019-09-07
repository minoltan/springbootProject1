package io.firstproject.project1.Service;


import NeedClasses.RandomIdGenerator;
import io.firstproject.project1.model.Faq;
import io.firstproject.project1.Repository.FaqRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FaqService {

  @Autowired

  private FaqRepository faqRepository;

  public List<Faq> getAllFaqs(){
      try{
          List<Faq> faqs = new ArrayList<>();
          faqRepository.findAll().forEach(faqs::add);
          System.out.println("Successfully retrieved all Faqs");
          return faqs;
      }catch (Exception ex){
          System.out.println("Unable to retrieve the Faq details");
          System.out.println("Error: " + ex);
          return null;
      }


  }

  public Faq getFaq(String id){
      return faqRepository.findById(id).orElse(null);
  }

  public boolean addFaq(Faq faq) {
      RandomIdGenerator randomIdGenerator = new RandomIdGenerator();
      faq.setId(randomIdGenerator.generateId());

      try {
          this.faqRepository.save(faq);
          System.out.println("Successfully uploaded the faq information us details to the db");
          return true;
      } catch (Exception ex) {
          System.out.println("Unable to upload the faq information details to the db");
          return false;
      }
  }

  public void updateFaq(Faq faq, String id){
      faqRepository.save(faq);
  }

  public void deleteAllFaq(){
        faqRepository.deleteAll();
    }


    public void deleteFaq(String id){
      faqRepository.deleteById(id);
  }

}
