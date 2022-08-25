package pl.halczak.user;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor

public class UserController {

  private final UserService userService;

    @RequestMapping("/add")
    @ResponseBody
    public String addUser() {
      User user = new User();
      user.setFirstName("Jan");
      user.setLastName("Nowak");
      user.setEmail("jan.nowak@gmail.com");
      return "Id dodanego usera to: " + user.getId();
    }

    @RequestMapping ("/get/{id}")
    @ResponseBody
    public String getUser(@PathVariable long id) {
      User user = userService.findById(id);
      return user.toString();

    }
}
