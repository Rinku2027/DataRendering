package com.DataRenderingApp.DataRenderingApp.Controller;

import com.DataRenderingApp.DataRenderingApp.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/users")
    public String getUsers(Model model) {
        List<User> userList = createUserList(); // Fetch or create a list of users

        model.addAttribute("users", userList);

        return "userList";
    }

    private List<User> createUserList() {
        // Example user data
        List<User> userList = new ArrayList<>();

        User user1 = new User();
        user1.setFirstName("John");
        user1.setLastName("Doe");
        user1.setDateOfBirth(LocalDate.of(1990, 5, 15));
        user1.setUsername("johndoe");
        user1.setEmail("johndoe@example.com");
        userList.add(user1);

        User user2 = new User();
        user2.setFirstName("Jane");
        user2.setLastName("Smith");
        user2.setDateOfBirth(LocalDate.of(1985, 9, 20));
        user2.setUsername("janesmith");
        user2.setEmail("janesmith@example.com");
        userList.add(user2);

        return userList;
    }
}

