package com.bs.glr.mapper;

import com.bs.glr.bean.BsScore;
import com.bs.glr.bean.BsScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BsScoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_score
     *
     * @mbg.generated
     */
    long countByExample(BsScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_score
     *
     * @mbg.generated
     */
    int deleteByExample(BsScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_score
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_score
     *
     * @mbg.generated
     */
    int insert(BsScore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_score
     *
     * @mbg.generated
     */
    int insertSelective(BsScore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_score
     *
     * @mbg.generated
     */
    List<BsScore> selectByExample(BsScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_score
     *
     * @mbg.generated
     */
    BsScore selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_score
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") BsScore record, @Param("example") BsScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_score
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") BsScore record, @Param("example") BsScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_score
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(BsScore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_score
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(BsScore record);
}