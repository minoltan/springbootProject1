package io.firstproject.project1.Repository;

import io.firstproject.project1.model.Faq;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqRepository extends CrudRepository<Faq, String> {


}








