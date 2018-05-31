package org.com.service;


import org.com.entity.User;
import java.util.List;

public interface UserService {
    /**
     * 添加
     * @param user
     * @return
     */
    public int insert(User user);

    /**
     * 修改
     * @param user
     * @return
     */
    public int update(User user);

    /**
     * 删除
     * @param user_id
     * @return
     */
    public int delete(int user_id);

    /**
     * id查询
     * @param user_id
     * @return
     */
    public User selectById(int user_id);

    /**
     * 查询所有
     * @return
     */
    public List<User> selectAll();
}