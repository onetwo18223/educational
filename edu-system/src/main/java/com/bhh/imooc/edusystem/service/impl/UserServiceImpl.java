package com.bhh.imooc.edusystem.service.impl;

import com.bhh.imooc.edusystem.domain.dto.UserDTO;
import com.bhh.imooc.edusystem.domain.entity.User;
import com.bhh.imooc.edusystem.mapper.UserMapper;
import com.bhh.imooc.edusystem.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bhh
 * @since 2020-12-16
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO getUserById(Long id){

        UserDTO userDTO = new UserDTO();
        User user = userMapper.selectById(id);
        BeanUtils.copyProperties(user, userDTO);

        return userDTO;
    }
}
