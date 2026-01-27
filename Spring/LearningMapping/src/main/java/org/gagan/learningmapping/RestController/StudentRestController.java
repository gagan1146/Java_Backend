package org.gagan.learningmapping.RestController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/restcontroller/")
public class StudentRestController {
    @GetMapping(path="/sayHello")
    public String sayHello(){
        return "Hello";
    }
    @GetMapping(path="/sayHello/{firstName}/{lastName}")
    public String sayHelloFirstLast(@PathVariable(value="firstName") String firstName, @PathVariable(value = "lastName",required = false) String lastName){
        return "Hello " + firstName + " " + lastName ;
    }

    //@RequestBody     // here we pass the Object in form of json

    // ResponseEntity  // It returns the entire HTTP response
}
