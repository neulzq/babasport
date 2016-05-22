package com.lionxxw.babasport.core.entity;

import java.util.Date;

public class Product {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.id
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.no
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private String no;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.name
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.weight
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private Double weight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.is_new
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private Integer isNew;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.is_hot
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private Integer isHot;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.is_commend
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private Integer isCommend;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.create_time
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.create_user_id
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private String createUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.check_time
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private Date checkTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.check_user_id
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private String checkUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.is_show
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private Integer isShow;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.is_del
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private Integer isDel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.type_id
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private Integer typeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.brand_id
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private Integer brandId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.keywords
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private String keywords;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.sales
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private Integer sales;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.description
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.package_list
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private String packageList;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.feature
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private String feature;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.color
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private String color;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.size
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private String size;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.id
     *
     * @return the value of product.id
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.id
     *
     * @param id the value for product.id
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.no
     *
     * @return the value of product.no
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public String getNo() {
        return no;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.no
     *
     * @param no the value for product.no
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.name
     *
     * @return the value of product.name
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.name
     *
     * @param name the value for product.name
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.weight
     *
     * @return the value of product.weight
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.weight
     *
     * @param weight the value for product.weight
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.is_new
     *
     * @return the value of product.is_new
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public Integer getIsNew() {
        return isNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.is_new
     *
     * @param isNew the value for product.is_new
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.is_hot
     *
     * @return the value of product.is_hot
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public Integer getIsHot() {
        return isHot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.is_hot
     *
     * @param isHot the value for product.is_hot
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.is_commend
     *
     * @return the value of product.is_commend
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public Integer getIsCommend() {
        return isCommend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.is_commend
     *
     * @param isCommend the value for product.is_commend
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setIsCommend(Integer isCommend) {
        this.isCommend = isCommend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.create_time
     *
     * @return the value of product.create_time
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.create_time
     *
     * @param createTime the value for product.create_time
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.create_user_id
     *
     * @return the value of product.create_user_id
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.create_user_id
     *
     * @param createUserId the value for product.create_user_id
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.check_time
     *
     * @return the value of product.check_time
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public Date getCheckTime() {
        return checkTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.check_time
     *
     * @param checkTime the value for product.check_time
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.check_user_id
     *
     * @return the value of product.check_user_id
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public String getCheckUserId() {
        return checkUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.check_user_id
     *
     * @param checkUserId the value for product.check_user_id
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setCheckUserId(String checkUserId) {
        this.checkUserId = checkUserId == null ? null : checkUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.is_show
     *
     * @return the value of product.is_show
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public Integer getIsShow() {
        return isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.is_show
     *
     * @param isShow the value for product.is_show
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.is_del
     *
     * @return the value of product.is_del
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.is_del
     *
     * @param isDel the value for product.is_del
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.type_id
     *
     * @return the value of product.type_id
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.type_id
     *
     * @param typeId the value for product.type_id
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.brand_id
     *
     * @return the value of product.brand_id
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.brand_id
     *
     * @param brandId the value for product.brand_id
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.keywords
     *
     * @return the value of product.keywords
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.keywords
     *
     * @param keywords the value for product.keywords
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.sales
     *
     * @return the value of product.sales
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public Integer getSales() {
        return sales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.sales
     *
     * @param sales the value for product.sales
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setSales(Integer sales) {
        this.sales = sales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.description
     *
     * @return the value of product.description
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.description
     *
     * @param description the value for product.description
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.package_list
     *
     * @return the value of product.package_list
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public String getPackageList() {
        return packageList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.package_list
     *
     * @param packageList the value for product.package_list
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setPackageList(String packageList) {
        this.packageList = packageList == null ? null : packageList.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.feature
     *
     * @return the value of product.feature
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public String getFeature() {
        return feature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.feature
     *
     * @param feature the value for product.feature
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.color
     *
     * @return the value of product.color
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public String getColor() {
        return color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.color
     *
     * @param color the value for product.color
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.size
     *
     * @return the value of product.size
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public String getSize() {
        return size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.size
     *
     * @param size the value for product.size
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }
}