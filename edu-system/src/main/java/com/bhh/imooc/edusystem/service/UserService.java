package com.bhh.imooc.edusystem.service;

import com.bhh.imooc.edusystem.domain.dto.UserDTO;
import com.bhh.imooc.edusystem.domain.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bhh
 * @since 2020-12-16
 */
public interface UserService{

    public UserDTO getUserById(Long id);

}
