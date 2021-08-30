package io.github.UdayHE.user.service;

import io.github.UdayHE.user.entity.User;
import io.github.UdayHE.user.repository.UserRepository;
import io.github.UdayHE.user.vo.Department;
import io.github.UdayHE.user.vo.ResponseTemplateVO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static io.github.UdayHE.user.constants.Constants.DEPARTMENT_SERVICE_URL;

/**
 * Created by udayhegde
 */
@Service
@AllArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;
    private final RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("In UserService -> saveUser()");
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        log.info("In UserService -> getUser()");
        ResponseTemplateVO responseTemplate = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);
        Department department = restTemplate.
                getForObject(DEPARTMENT_SERVICE_URL + user.getDepartmentId(), Department.class);
        responseTemplate.setDepartment(department);
        responseTemplate.setUser(user);
        return responseTemplate;
    }
}
