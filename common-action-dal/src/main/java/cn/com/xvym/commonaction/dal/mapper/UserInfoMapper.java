package cn.com.xvym.commonaction.dal.mapper;

import cn.com.xvym.commonaction.dal.entity.UserInfoEntity;
import org.springframework.stereotype.Repository;

/**
* @author xvym
* @description 针对表【t_user_info】的数据库操作Mapper
* @createDate 2022-02-20 23:13:19
* @Entity cn.com.xvym.commonaction.dal.entity.UserInfoEntity
*/
@Repository
public interface UserInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserInfoEntity record);

    int insertSelective(UserInfoEntity record);

    UserInfoEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfoEntity record);

    int updateByPrimaryKey(UserInfoEntity record);

}
