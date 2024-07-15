package onlinevoting;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import onlinevoting.entity.Party;
import onlinevoting.entity.User;
import onlinevoting.service.PartyService;
import onlinevoting.service.UserService;

@SpringBootTest
class OnlineVotingSystemApplicationTests {
	@Autowired
	private UserService userService;
	@Autowired
	private PartyService partyService;
	static User user = null;
	static Party party=null;
	@Test
	void contextLoads() {
			}
	//Test Cases for User
//	@BeforeAll
//    static void setUpBeforeClass() throws Exception {
//         user=new User();
//        user.setUserName("amol");
//        user.setUserMobileNumber("8053897276");
//        user.setUserPassword("Amol@123");
//        user.setUserRole("voter");
//        user.setUserAddress("Shahapur");
//        user.setUserDateOfBirth(LocalDate.of(1996, 1, 1));
//        user.setUserEmail("amol@gmail.com");
//        user.setUserVotingCardNumber("amol123456");
//        user.setUserGender("male");
//    }
//	@Test
//	void testRegisterUser() {
//		assertNotNull(userService.registerUser(user));
//	}
	@Test
	void testGetUserById() {
		assertNotNull(userService.getUserById(26));
	}

	@Test
	void testGetUserByRole() {
		assertNotNull(userService.getUserByRole("voter"));
	}

//	@Test
//	void testDeleteUser() {
//		User userToDelete = new User();
//		userToDelete = userService.registerUser(userToDelete);
//		userService.deleteByUserId(userToDelete.getUserId());
//		assertThrows(ResourceNotFoundException.class, () -> userService.deleteByUserId(userToDelete.getUserId()));
//	}
	
	//Test Cases for Party
	@Test
	void testGetPartyById() {
		assertNotNull(partyService.getPartyById(11));
	}

}
