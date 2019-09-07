package io.firstproject.project1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class hello {
    @GetMapping
    private String Hello(){
        return "vipisanan";
    }
    @PostMapping ("/post")
    private String SomePost(){
            return "Some Post";
    }


}
