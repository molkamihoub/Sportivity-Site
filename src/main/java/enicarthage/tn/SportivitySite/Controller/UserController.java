package enicarthage.tn.SportivitySite.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import enicarthage.tn.SportivitySite.Model.User;
import Service.UserService;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
	 private final UserService userService;
	  @Autowired
	  public UserController(UserService userService) {
	        this.userService = userService;
	       
	    }
@GetMapping
public ResponseEntity<List<User>> getAll(){
	         return new ResponseEntity<>(
	                 (List<User>) userService.getAllusers(),HttpStatus.OK);
	    }
	

	
}
