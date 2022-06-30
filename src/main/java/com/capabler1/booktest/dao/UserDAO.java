package com.capabler1.booktest.dao;

import com.capabler1.booktest.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author capabler1
 * @version 1.0
 * @date 2022/6/27 11:36
 */
public interface UserDAO extends JpaRepository<User,Integer> {
    User findByUsername(String username);

    User getByUsernameAndPassword(String username,String password);
}
