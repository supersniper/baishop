package com.baishop.entity.ass;

import java.io.Serializable;

public class AdminsRoles implements Serializable {
	
	private static final long serialVersionUID = 7684833073249511873L;

	/**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_admins_roles.role_id
     *
     * @ibatorgenerated Thu Nov 03 18:04:39 CST 2011
     */
    private Integer roleId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_admins_roles.user_id
     *
     * @ibatorgenerated Thu Nov 03 18:04:39 CST 2011
     */
    private Integer userId;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_admins_roles.role_id
     *
     * @return the value of bai_admins_roles.role_id
     *
     * @ibatorgenerated Thu Nov 03 18:04:39 CST 2011
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_admins_roles.role_id
     *
     * @param roleId the value for bai_admins_roles.role_id
     *
     * @ibatorgenerated Thu Nov 03 18:04:39 CST 2011
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_admins_roles.user_id
     *
     * @return the value of bai_admins_roles.user_id
     *
     * @ibatorgenerated Thu Nov 03 18:04:39 CST 2011
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_admins_roles.user_id
     *
     * @param userId the value for bai_admins_roles.user_id
     *
     * @ibatorgenerated Thu Nov 03 18:04:39 CST 2011
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}