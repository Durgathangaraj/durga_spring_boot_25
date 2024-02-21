package demo.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Realestate>getRealEstate(){
        return rerepo.findAll();
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
    public Realestate put(int id,Realestate po)
    {
        Realestate user=rerepo.findById(id).orElse(null);
        if(user!=null)
        {
            user.setEstateId(user.getEstateId());
            user.setEstatename(user.getEstatename());
            user.setDescription(user.getDescription());
            user.setRent(user.getRent());
            user.setArea(user.getArea());
            user.setSupplier(user.getSupplier());
            return rerepo.saveAndFlush(user);
        }
        else{
            return null;
        }
    }
}
