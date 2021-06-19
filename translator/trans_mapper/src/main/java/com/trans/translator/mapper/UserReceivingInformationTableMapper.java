package com.trans.translator.mapper;

import com.trans.translator.bo.UserAccountBo;
import com.trans.translator.po.UserReceivingInformationTable;

/**
* 通用 Mapper 代码生成器
*
* @author mapper-generator
*/
public interface UserReceivingInformationTableMapper extends tk.mybatis.mapper.common.Mapper<UserReceivingInformationTable> {
    /**
     * 用户新增收货地址，插入收货地址表
     * @param accountBo
     * @return
     */
    public int insertIntoUserRecTab(UserAccountBo accountBo);
}




