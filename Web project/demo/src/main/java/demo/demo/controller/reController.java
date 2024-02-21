package demo.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

import demo.demo.model.Realestate;
//import demo.demo.model.Login;
import demo.demo.service.reService;
//import demo.demo.service.Loginservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class reController {
   
    @Autowired reService r;
    
    @GetMapping("/getproduct")
    public  List<Realestate> getMethod() {
        return r.getRealEstate();
    }

    @PostMapping("/addproduct")
    public Realestate postMethodName(@RequestBody Realestate entity) {
        return r.addRealEstate(entity);
    }
    
    
    @PutMapping("/putproduct/{id}")
    public Realestate putMethodName(@PathVariable int id, @RequestBody Realestate entity) {
        return r.put(id, entity);
    }
    
    @DeleteMapping("/deleteproduct/{id}")
    public String deleteProduct(@PathVariable int id)
    {
        return r.delete(id);
    }
    
    @GetMapping("/getProduct/{id}")
    public Optional<Realestate> getbyId(@PathVariable int id) {
        return r.getbyId(id);
    }


    
}
