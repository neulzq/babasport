package com.lionxxw.babasport.user.mapper;

import com.lionxxw.babasport.user.entity.DeliveryAddress;
import com.lionxxw.babasport.user.entity.DeliveryAddressExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeliveryAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_delivery_address
     *
     * @mbggenerated Tue Jun 28 10:59:08 CST 2016
     */
    int countByExample(DeliveryAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_delivery_address
     *
     * @mbggenerated Tue Jun 28 10:59:08 CST 2016
     */
    int deleteByExample(DeliveryAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_delivery_address
     *
     * @mbggenerated Tue Jun 28 10:59:08 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_delivery_address
     *
     * @mbggenerated Tue Jun 28 10:59:08 CST 2016
     */
    int insert(DeliveryAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_delivery_address
     *
     * @mbggenerated Tue Jun 28 10:59:08 CST 2016
     */
    int insertSelective(DeliveryAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_delivery_address
     *
     * @mbggenerated Tue Jun 28 10:59:08 CST 2016
     */
    List<DeliveryAddress> selectByExample(DeliveryAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_delivery_address
     *
     * @mbggenerated Tue Jun 28 10:59:08 CST 2016
     */
    DeliveryAddress selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_delivery_address
     *
     * @mbggenerated Tue Jun 28 10:59:08 CST 2016
     */
    int updateByExampleSelective(@Param("record") DeliveryAddress record, @Param("example") DeliveryAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_delivery_address
     *
     * @mbggenerated Tue Jun 28 10:59:08 CST 2016
     */
    int updateByExample(@Param("record") DeliveryAddress record, @Param("example") DeliveryAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_delivery_address
     *
     * @mbggenerated Tue Jun 28 10:59:08 CST 2016
     */
    int updateByPrimaryKeySelective(DeliveryAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_delivery_address
     *
     * @mbggenerated Tue Jun 28 10:59:08 CST 2016
     */
    int updateByPrimaryKey(DeliveryAddress record);
}