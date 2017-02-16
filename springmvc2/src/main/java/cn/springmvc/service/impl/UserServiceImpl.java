package cn.springmvc.service.impl;

/**
 * Created by luodejin on 17/2/7.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.dao.UserDAO;
import cn.springmvc.model.User;
import cn.springmvc.service.UserService;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;

    @Override
    public int insertUser(User user) {
        // TODO Auto-generated method stub
        return userDAO.insertUser(user);
    }

    @Override
    public int updateUser (User user,int id) {
        // TODO Auto-generated method stub
        return userDAO.updateUser(user,id);
    }

    @Override
    public int deleteUser(int id) {
        // TODO Auto-generated method stub
        return userDAO.deleteUser(id);
    }

    @Override
    public User selectUserById(int id) {
        // TODO Auto-generated method stub
        return userDAO.selectUserById(id);
    }

    @Override
    public List<User> selectAllUser() {
        // TODO Auto-generated method stub
        return userDAO.selectAllUser();
    }

}
