package io.firstproject.project1.controller;


import io.firstproject.project1.model.Faq;
import io.firstproject.project1.Service.FaqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin("http://localhost:4200")
@RequestMapping("/Faq")
public class FaqController {

    @Autowired
    private FaqService faqService;

    @GetMapping("/getAllFaqs")
    public List<Faq> getAllFaq(){
        return faqService.getAllFaqs();
    }

    @GetMapping("/getAllFaqs/{id}")
    public Faq getFaq(@PathVariable String id){
        return faqService.getFaq(id);
    }

    @PostMapping("/addFaq")
    public void addFaq(@RequestBody Faq faq){
        faqService.addFaq(faq);
    }

    @PutMapping("/updateFaq/{id}")
    public void updateFaq(@RequestBody Faq faq, @PathVariable String id){
        faqService.updateFaq(faq, id);
    }

    @DeleteMapping("/deleteAllFaqs")
    public void deleteFaq(){
        faqService.deleteAllFaq();
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteFaq(@PathVariable String id){
        faqService.deleteFaq(id);
    }


}
