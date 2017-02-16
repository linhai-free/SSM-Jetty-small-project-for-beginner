package cn.springmvc.service;

/**
 * Created by luodejin on 17/2/7.
 */
import cn.springmvc.model.User;

import java.util.List;


public interface UserService {

    public int insertUser(User user);
    public int updateUser (User user,int id);
    public int deleteUser(int id);
    public User selectUserById(int id);
    public List<User> selectAllUser();

}