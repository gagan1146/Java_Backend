package org.gagan.learningmapping.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/controller/", method = RequestMethod.GET)    // it is used to define the path through which request comes into this class as it can be ignored as well
public class StudentController {
    @RequestMapping(path = "/sayHello", method = RequestMethod.GET)   // it is used to map or create an api
    @ResponseBody                           // it is used to say that it is a string not a jsp file
    public String sayHello(){
        return "Hello";
    }
    @RequestMapping(path = "/sayHello/{firstName}", method = RequestMethod.GET)
    @ResponseBody
    public String sayHelloToMe(@PathVariable(value="firstName") String firstName){
        return "Hello " + firstName;
    }
    @RequestMapping(path="/hello/firstName", method = RequestMethod.GET)
    @ResponseBody
    public String sayMyName(@RequestParam(name="firstName") String firstName){
        return "Hello " + firstName;
    }

}
