package demo.demo.controller;

// import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import demo.demo.model.Realestate;
//import demo.demo.model.Login;
import demo.demo.service.reService;
//import demo.demo.service.Loginservice;

import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class reController {
   
    @Autowired reService r;
    
    // @GetMapping("/getproduct")
    //  public Page<Realestate> getMethod(
    //         @RequestParam(defaultValue = "0") int page,
    //         @RequestParam(defaultValue = "10") int size,
    //         @RequestParam(defaultValue = "estateId") String sortBy) {
        
    //   Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
    //     return r.getRealEstate(pageable);
    // }
    // public  Page<Realestate> getMethod(Pageable pageable) {
    //     return r.getRealEstate();
    // }

    
    @PostMapping("/addproduct")
    public Realestate postMethodName(@RequestBody Realestate entity) {
        return r.addRealEstate(entity);
    }
    
    @GetMapping("/getproduct/paged")
    public ResponseEntity<Page<Realestate>> getPagedRealEstate(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "estateId") String sortBy) {

        Page<Realestate> realEstatePage = r.getRealEstate(page, size, sortBy);
        if (realEstatePage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(realEstatePage, HttpStatus.OK);
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
