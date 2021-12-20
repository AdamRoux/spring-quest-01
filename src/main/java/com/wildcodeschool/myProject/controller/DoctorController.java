package com.wildcodeschool.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String index() {
        return "<h1>I am Doctor William Hartnell !<h1/> <br>  <img src=https://images.moviefit.me/p/o/20381-william-hartnell.jpg>";
    }
    @GetMapping("/doctor/10")
    @ResponseBody
    public String index2() {
   	 return "<h1>I am Doctor David Tennant !<h1/>  <br> <img src=https://medias.spotern.com/wanted/w640/1/1544-1532336922.jpg>";
    }
    @GetMapping("/doctor/13")
    @ResponseBody
    public String index3() {
   	 return "<h1> I am Doctor Jodie Whittaker !<h1/> <br> <img src=https://www.premiere.fr/sites/default/files/styles/scale_crop_border_white_1280x720/public/2018-05/jodie-whittaker-doctor-who-full.jpg>";
    }
}
