 package demo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.demo.model.Realestate;

public interface reRepo extends JpaRepository<Realestate,Integer> {
    
}
