package demo.demo.service;

// import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import demo.demo.model.Realestate;
import demo.demo.repository.reRepo;

@Service
public class reService {
    @Autowired
    reRepo rerepo;
    public Realestate addRealEstate(Realestate RealEstate){
        return rerepo.save(RealEstate);
    }
    // public Page<Realestate>getRealEstate(Pageable pageable){
    //     return rerepo.findAll(pageable);
    // }
    public Page<Realestate> getRealEstate(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return rerepo.findAll(pageable);
    }
    public Optional<Realestate> getbyId(int id)
    {
        return rerepo.findById(id);
    }
    public String delete(int id)
    {
        rerepo.deleteById(id);
        return "Deleted";
    }
    
}
