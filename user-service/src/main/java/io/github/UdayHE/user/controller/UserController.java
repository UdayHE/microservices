package io.github.UdayHE.user.controller;

import io.github.UdayHE.user.entity.User;
import io.github.UdayHE.user.service.UserService;
import io.github.UdayHE.user.vo.ResponseTemplateVO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * Created by udayhegde
 */
@RestController
@RequestMapping("/users")
@AllArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        log.info("In UserController -> saveUser()");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUser(@PathVariable("id") Long userId) {
        log.info("In UserController -> getUser()");
        return userService.getUserWithDepartment(userId);
    }
}
