package com.xiao.mb.commonmodule.web.dao;

import com.xiao.mb.commonmodule.core.generic.GenericDao;
import com.xiao.mb.commonmodule.web.domain.pojo.CommentPicture;
import com.xiao.mb.commonmodule.web.domain.pojo.CommentPictureExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentPictureMapper extends GenericDao {
    int countByExample(CommentPictureExample example);

    int deleteByExample(CommentPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CommentPicture record);

    int insertSelective(CommentPicture record);

    List<CommentPicture> selectByExample(CommentPictureExample example);

    CommentPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CommentPicture record, @Param("example") CommentPictureExample example);

    int updateByExample(@Param("record") CommentPicture record, @Param("example") CommentPictureExample example);

    int updateByPrimaryKeySelective(CommentPicture record);

    int updateByPrimaryKey(CommentPicture record);
}