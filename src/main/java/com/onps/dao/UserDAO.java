package com.onps.dao;

import com.onps.model.User;
import com.onps.model.po.UserPO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserDAO {
    void insertUser(UserPO userPO)throws Exception;
    void deleteUser(UserPO userPO)throws Exception;
    List<UserPO> getUserList();
    User getUserById(String id);
    User getUserByUserName(String userName);
    User login(String username);
    void updateUser(UserPO userPO)throws Exception;
}
