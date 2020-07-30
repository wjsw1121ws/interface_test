package com.wcc.intf.mapper;

import com.wcc.intf.pojo.Syn;
import com.wcc.intf.pojo.SynExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SynMapper {
    long countByExample(SynExample example);

    int deleteByExample(SynExample example);

    /**
     * delete by primary key
     *
     * @param idSyn primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String idSyn);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Syn record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Syn record);

    List<Syn> selectByExample(SynExample example);

    /**
     * select by primary key
     *
     * @param idSyn primary key
     * @return object by primary key
     */
    Syn selectByPrimaryKey(String idSyn);

    int updateByExampleSelective(@Param("record") Syn record, @Param("example") SynExample example);

    int updateByExample(@Param("record") Syn record, @Param("example") SynExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Syn record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Syn record);
}