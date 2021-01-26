package com.trans.login.pojo;


import lombok.Data;

import java.io.Serializable;

/**
 * @author vessel
 *
 * 缺少java pre...依赖 无法使用 @Id 注解
 */
@Data
public class AdminTable implements Serializable {

  private static final long serialVersionUID = 2616282945696434718L;

  private long aId;

  private String aUid;
  private String aIdNum;
  private String aName;
  private String aPassword;
  private String aPhone;
  private long aJurisdiction;
  private long aStatus;

}
