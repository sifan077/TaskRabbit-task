package gdufs.agency.service.impl;

import gdufs.agency.dao.UserMapper;
import gdufs.agency.entity.User;
import gdufs.agency.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userDao;

    @Override
    public User getUser(String openId) {
        // TODO Auto-generated method stub
        User user = userDao.selectByPrimaryKey(openId);
        return user;
    }

    @Override
    public boolean updateUser(User user) {
        // TODO Auto-generated method stub
        int row = userDao.updateByPrimaryKeySelective(user);
        if (row == 1)
            return true;
        else
            return false;
    }

    @Override
    public int setAvatarUrl(User user) {
        return userDao.updateByPrimaryKeySelective(user);
    }
}
