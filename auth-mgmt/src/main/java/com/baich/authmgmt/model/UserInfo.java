package com.baich.authmgmt.model;

public class UserInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_id
     *
     * @mbg.generated Mon Dec 06 16:27:52 CST 2021
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_name
     *
     * @mbg.generated Mon Dec 06 16:27:52 CST 2021
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.gender
     *
     * @mbg.generated Mon Dec 06 16:27:52 CST 2021
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_level
     *
     * @mbg.generated Mon Dec 06 16:27:52 CST 2021
     */
    private String userLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_role
     *
     * @mbg.generated Mon Dec 06 16:27:52 CST 2021
     */
    private String userRole;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Mon Dec 06 16:27:52 CST 2021
     */
    public UserInfo(Integer userId, String userName, String gender, String userLevel, String userRole) {
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.userLevel = userLevel;
        this.userRole = userRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Mon Dec 06 16:27:52 CST 2021
     */
    public UserInfo() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_id
     *
     * @return the value of user_info.user_id
     *
     * @mbg.generated Mon Dec 06 16:27:52 CST 2021
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_id
     *
     * @param userId the value for user_info.user_id
     *
     * @mbg.generated Mon Dec 06 16:27:52 CST 2021
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_name
     *
     * @return the value of user_info.user_name
     *
     * @mbg.generated Mon Dec 06 16:27:52 CST 2021
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_name
     *
     * @param userName the value for user_info.user_name
     *
     * @mbg.generated Mon Dec 06 16:27:52 CST 2021
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.gender
     *
     * @return the value of user_info.gender
     *
     * @mbg.generated Mon Dec 06 16:27:52 CST 2021
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.gender
     *
     * @param gender the value for user_info.gender
     *
     * @mbg.generated Mon Dec 06 16:27:52 CST 2021
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_level
     *
     * @return the value of user_info.user_level
     *
     * @mbg.generated Mon Dec 06 16:27:52 CST 2021
     */
    public String getUserLevel() {
        return userLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_level
     *
     * @param userLevel the value for user_info.user_level
     *
     * @mbg.generated Mon Dec 06 16:27:52 CST 2021
     */
    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_role
     *
     * @return the value of user_info.user_role
     *
     * @mbg.generated Mon Dec 06 16:27:52 CST 2021
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_role
     *
     * @param userRole the value for user_info.user_role
     *
     * @mbg.generated Mon Dec 06 16:27:52 CST 2021
     */
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}