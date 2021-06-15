package com.taskagile.app.web.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
  @GetMapping({"/","/login"})
  public String entry() {
    return "index";
  }
}
