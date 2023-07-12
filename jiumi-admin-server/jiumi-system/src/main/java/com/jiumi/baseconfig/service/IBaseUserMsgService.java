package com.jiumi.baseconfig.service;

import java.util.List;
import com.jiumi.baseconfig.domain.BaseUserMsg;

/**
 * 用户业务消息Service接口
 *
 * @author jiumi
 * @date 2021-09-19
 */
public interface IBaseUserMsgService
{
    /**
     * 查询用户业务消息
     *
     * @param id 用户业务消息主键
     * @return 用户业务消息
     */
    public BaseUserMsg selectBaseUserMsgById(String id);

    /**
     * 查询用户业务消息列表
     *
     * @param baseUserMsg 用户业务消息
     * @return 用户业务消息集合
     */
    public List<BaseUserMsg> selectBaseUserMsgList(BaseUserMsg baseUserMsg);

    /**
     * 新增用户业务消息
     *
     * @param baseUserMsg 用户业务消息
     * @return 结果
     */
    public int insertBaseUserMsg(BaseUserMsg baseUserMsg);

    /**
     * 修改用户业务消息
     *
     * @param baseUserMsg 用户业务消息
     * @return 结果
     */
    public int updateBaseUserMsg(BaseUserMsg baseUserMsg);

    /**
     * 批量删除用户业务消息
     *
     * @param ids 需要删除的用户业务消息主键集合
     * @return 结果
     */
    public int deleteBaseUserMsgByIds(String[] ids);

    /**
     * 删除用户业务消息信息
     *
     * @param id 用户业务消息主键
     * @return 结果
     */
    public int deleteBaseUserMsgById(String id);
}
