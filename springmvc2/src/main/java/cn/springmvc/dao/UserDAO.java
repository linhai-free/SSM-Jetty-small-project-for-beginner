package cn.springmvc.dao;

/**
 * Created by luodejin on 17/2/7.
 */
import java.util.List;

import cn.springmvc.model.User;

public interface UserDAO {

    /**
     * 添加新用户
     * @param user
     * @return
     * @throws Exception
     */
    public int insertUser(User user);
    /**
     * 修改用戶
     * @param user
     * @param id
     * @return
     * @throws Exception
     */
    public int updateUser (User user,int id);
    /**
     * 刪除用戶
     * @param id
     * @return
     * @throws Exception
     */
    public int deleteUser(int id);
    /**
     * 根据id查询用户信息
     * @param id
     * @return
     * @throws Exception
     */
    public User selectUserById(int id);
    /**
     * 查询所有的用户信息
     * @return
     * @throws Exception
     */
    public List<User> selectAllUser();

}
