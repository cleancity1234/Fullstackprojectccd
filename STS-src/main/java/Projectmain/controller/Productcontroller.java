package Projectmain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Projectmain.model.Productinfo;
import Projectmain.repository.Productrepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Productcontroller 



{

	@Autowired 
	private Productrepository prepo;
	
	//services
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/productinsert")
	
	public Productinfo insert(@RequestBody Productinfo p)
	{
		return this.prepo.save(p);
	}
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/productupdate")
	
	public Productinfo update(@RequestBody Productinfo p)
	{
		return this.prepo.save(p);
	}
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/productdelete")
	public void delete(@RequestBody Productinfo p)
	{
		this.prepo.delete(p);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/productview")
	public List<Productinfo> view()
	{
		return this.prepo.findAll();
	}
	
	
	
}