package com.gem.vlog.mapper;

import com.gem.vlog.model.entity.User;
import org.apache.ibatis.annotations.*;

import java.sql.SQLException;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author admin
 * @Date 2020/12/5
 */

public interface UserMapper {
    /**
     *
     * @param user 入参user 对象
     * @throws SQLException 异常
     */
    @Insert("INSERT INTO t_user (wx_openid,phone,nickname,avatar,create_time)values (#{wxOpenId},#{phone},#{nickname},#{avatar},#{createTime})")
  @Options(useGeneratedKeys = true,keyProperty = "id")
    void insert(User user) throws SQLException;

    /**
     *
     * @param phone 手机号
     * @return User 用户对象
     * @throws SQLException 异常
     */
@Select({"<script>",
       "SELECT * FROM t_user",
         "where 1=1",
           "<when test='phone!=null'>",
            "and phone =#{phone}",
             "</when>",
              "</script>"})
    User findUserByPhone(@Param("phone")String phone)throws SQLException;

    /**
     *
     * @param user 用户对象
      * @throws SQLException 异常
     */
    @Update("UPDATE t_user SET password=#{password},nickname=#{nickname},avatar=#{avatar},gender=#{gender},birthday=#{birthday},address=#{address} "+
"where phone=#{phone}")
void updateUser(User user) throws SQLException;

    /**
     *
     * @param wxOpenId 微信openId
     * @return User 用户对象
     * @throws SQLException 异常
     */
    @Select({"<script>",
    "SELECT * FROM t_user",
    "WHERE 1=1",
    "<when test='wxOpenId!=null'>",
    "AND wx_openid=#{wxOpenId}",
    "</when>",
    "</script>"})
    User findUserByOpenId(@Param("wxOpenId")String wxOpenId) throws SQLException;
}
