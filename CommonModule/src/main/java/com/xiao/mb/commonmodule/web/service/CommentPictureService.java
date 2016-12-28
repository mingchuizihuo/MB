package com.xiao.mb.commonmodule.web.service;


import com.xiao.mb.commonmodule.core.generic.GenericService;
import com.xiao.mb.commonmodule.web.domain.pojo.CommentPicture;
import com.xiao.mb.commonmodule.web.domain.pojo.CommentPictureExample;

public interface CommentPictureService extends GenericService<CommentPicture,Long,CommentPictureExample> {

    public Long[] insertPictures(String pictures, byte pictureType);

}
