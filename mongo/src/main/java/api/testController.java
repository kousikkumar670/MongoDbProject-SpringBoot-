package api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	@Autowired
	private testRepo repository;
	
	@Autowired(required=true)
	private testRepoOne repositoryOne;
	
	@RequestMapping(value = "users", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<testModel> getData() {
	return repository.findAll();
}
	@RequestMapping(value = "usersone", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<testModelOne> getDataOne() {
	return repositoryOne.findAll();
}
	@RequestMapping(value = "getName", method = RequestMethod.GET)
	public String getValue() {
	return "My name is kousik";
}
}
