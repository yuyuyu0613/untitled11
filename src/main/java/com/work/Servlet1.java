package com.work;



import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@Controller
public class Servlet1 {



@RequestMapping("/abc")
public String index(){
    System.out.println("ing....");

    System.out.println("add");
    return "test2";
}


}

