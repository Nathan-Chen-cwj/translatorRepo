package com.trans.translator.po;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`user_label_table`")
public class UserLabelTable implements Serializable {
    /**
     * 用户其他信息表的主键
     */
    @Id
    @Column(name = "`id`")
    private String id;

    /**
     * 用户的id，与用户主要信息表形成外键关系
     */
    @Column(name = "`u_id`")
    private String uId;


    /**
     * 用户个性化标签1
     */
    @Column(name = "`u_label1`")
    private String uLabel1;

    /**
     * 用户个性化标签2
     */
    @Column(name = "`u_label2`")
    private String uLabel2;

    /**
     * 用户个性化标签3
     */
    @Column(name = "`u_label3`")
    private String uLabel3;

    /**
     * 用户个性化标签4
     */
    @Column(name = "`u_label4`")
    private String uLabel4;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户其他信息表的主键
     *
     * @return id - 用户其他信息表的主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置用户其他信息表的主键
     *
     * @param id 用户其他信息表的主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户的id，与用户主要信息表形成外键关系
     *
     * @return u_id - 用户的id，与用户主要信息表形成外键关系
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置用户的id，与用户主要信息表形成外键关系
     *
     * @param uId 用户的id，与用户主要信息表形成外键关系
     */
    public void setuId(String uId) {
        this.uId = uId;
    }


    /**
     * 获取用户个性化标签1
     *
     * @return u_label1 - 用户个性化标签1
     */
    public String getuLabel1() {
        return uLabel1;
    }

    /**
     * 设置用户个性化标签1
     *
     * @param uLabel1 用户个性化标签1
     */
    public void setuLabel1(String uLabel1) {
        this.uLabel1 = uLabel1;
    }

    /**
     * 获取用户个性化标签2
     *
     * @return u_label2 - 用户个性化标签2
     */
    public String getuLabel2() {
        return uLabel2;
    }

    /**
     * 设置用户个性化标签2
     *
     * @param uLabel2 用户个性化标签2
     */
    public void setuLabel2(String uLabel2) {
        this.uLabel2 = uLabel2;
    }

    /**
     * 获取用户个性化标签3
     *
     * @return u_label3 - 用户个性化标签3
     */
    public String getuLabel3() {
        return uLabel3;
    }

    /**
     * 设置用户个性化标签3
     *
     * @param uLabel3 用户个性化标签3
     */
    public void setuLabel3(String uLabel3) {
        this.uLabel3 = uLabel3;
    }

    /**
     * 获取用户个性化标签4
     *
     * @return u_label4 - 用户个性化标签4
     */
    public String getuLabel4() {
        return uLabel4;
    }

    /**
     * 设置用户个性化标签4
     *
     * @param uLabel4 用户个性化标签4
     */
    public void setuLabel4(String uLabel4) {
        this.uLabel4 = uLabel4;
    }
}