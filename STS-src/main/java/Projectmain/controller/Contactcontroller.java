package Projectmain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Projectmain.model.Contactinfo;
import Projectmain.repository.Contactrepository;




@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Contactcontroller

{

	@Autowired 
	private Contactrepository crepo;
	
	//services
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/contact")
	
	public Contactinfo insert(@RequestBody Contactinfo cinfo)
	{
		return this.crepo.save(cinfo);
	}	
	
}