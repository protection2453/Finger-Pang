package com.example.test;

import javax.annotation.Resource;
/* DB연동 후 적용
import com.example.exception.IdPasswordNotMatchingException;
import com.example.test.dao.UserDAO;
import com.example.test.dto.AuthInfo;
import com.example.test.vo.UserVO;


public class UserServiceImpl implements UserService {
    @Resource(name = "userDAO")
    private UserDAO userDAO;

    @Override
    public AuthInfo loginAuth(LoginCommand loginCommand) throws Exception {
        UserVO user = userDAO.selectById(loginCommand.getId());
        if (user == null) {
            throw new IdPasswordNotMatchingException();
        }
        if(!user.matchPassword(loginCommand.getPw())){
            throw new IdPasswordNotMatchingException();
        }
        return new AuthInfo(user.getId(), user.getNickname(), user.getGender(), user.getAge(), user.getJob(), user.getArea(), user.getReligion());
    }
}
*/
