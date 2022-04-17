package Service;

import java.util.List;
import enicarthage.tn.SportivitySite.Model.User;
import enicarthage.tn.SportivitySite.Repository.userRepository;
public class UserService {

	public UserService() {
		// TODO Auto-generated constructor stub
	}
	public List<User> getAllusers(){
	        return userRepository.findAll(null);
	    }

}
