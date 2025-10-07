package corporativos.example.atv1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Atv1Controller {
  @GetMapping("/bem_vindo")
  public String welcomeMenssage(){
    return "Bem vindo!";
  }

  @GetMapping("/bem_vindo/{name}")
  public String personalizedMessage(@PathVariable String name){
    return "ola, " + name + "! Seja bem-vindo(a)"; 
  }
}
