package com.lionxxw.babasport.core.mapper;

import com.lionxxw.babasport.core.entity.Brand;
import com.lionxxw.babasport.core.entity.BrandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    int countByExample(BrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    int deleteByExample(BrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    int insert(Brand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    int insertSelective(Brand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    List<Brand> selectByExample(BrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    Brand selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    int updateByExampleSelective(@Param("record") Brand record, @Param("example") BrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    int updateByExample(@Param("record") Brand record, @Param("example") BrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    int updateByPrimaryKeySelective(Brand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    int updateByPrimaryKey(Brand record);
}