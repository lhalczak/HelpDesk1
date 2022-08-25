package pl.halczak.user;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor

public class UserService {
    private final UserDao userDao;

    public User findById(long id) {return userDao.findById(id);}


}
