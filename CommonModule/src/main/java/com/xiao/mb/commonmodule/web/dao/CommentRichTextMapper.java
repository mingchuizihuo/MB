package com.xiao.mb.commonmodule.web.dao;


import com.xiao.mb.commonmodule.core.generic.GenericDao;
import com.xiao.mb.commonmodule.web.domain.pojo.CommentRichText;
import com.xiao.mb.commonmodule.web.domain.pojo.CommentRichTextExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentRichTextMapper extends GenericDao {
    int countByExample(CommentRichTextExample example);

    int deleteByExample(CommentRichTextExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CommentRichText record);

    int insertSelective(CommentRichText record);

    List<CommentRichText> selectByExampleWithBLOBs(CommentRichTextExample example);

    List<CommentRichText> selectByExample(CommentRichTextExample example);

    CommentRichText selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CommentRichText record, @Param("example") CommentRichTextExample example);

    int updateByExampleWithBLOBs(@Param("record") CommentRichText record, @Param("example") CommentRichTextExample example);

    int updateByExample(@Param("record") CommentRichText record, @Param("example") CommentRichTextExample example);

    int updateByPrimaryKeySelective(CommentRichText record);

    int updateByPrimaryKeyWithBLOBs(CommentRichText record);

    int updateByPrimaryKey(CommentRichText record);
}