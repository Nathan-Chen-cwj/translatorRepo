package com.trans.login.pojo;


import lombok.Data;

import java.io.Serializable;

/**
 * @author vessel
 */
@Data
public class UserTable  implements Serializable {

  private static final long serialVersionUID = -5956553014108640468L;

  private long uId;
  private String uUid;
  private String uUsername;
  private String uPhone;
  private String uPassword;
  private long uStates;
  private long uJurisdiction;
  private String uImg;
  private String uAddr;
  private String uEmail;
  private String uLabel;

}
