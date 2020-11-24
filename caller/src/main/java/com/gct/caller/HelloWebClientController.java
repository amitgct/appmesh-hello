package com.gct.caller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import java.time.LocalDateTime;
import java.util.List;


@Controller
public class HelloWebClientController {

    @GetMapping("/call")
    public String handleRequest(Model model) {
        //accessing hello-service
        System.out.println("caller service");
            String url = "http://localhost:8086/hello";
            RestTemplate restTemplate = new RestTemplate();
            HelloObject helloObject = restTemplate.getForObject(url,
                    HelloObject.class);
            model.addAttribute("msg", helloObject.getMessage());
            model.addAttribute("time", LocalDateTime.now());
        System.out.println("message :"+helloObject.getMessage());
        System.out.println("time :"+LocalDateTime.now());
        return "hello-page";
    }
}