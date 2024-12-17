package com.mvc.xml;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/appointment")
public class AppointmentController {


    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public String getAppointment(){
        return "appointment";
    }
}
