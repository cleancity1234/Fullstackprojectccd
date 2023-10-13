package Projectmain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Projectmain.model.Contactinfo;



@Repository
public interface Contactrepository extends JpaRepository<Contactinfo,String> {

}
