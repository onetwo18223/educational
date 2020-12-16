package com.bhh.imooc.edusystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bhh.imooc.edusystem.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author bhh
 * @since 2020-12-16
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
