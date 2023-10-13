package Projectmain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Projectmain.model.Login;

@Repository
public interface Loginrepository extends JpaRepository<Login,String> {

}
