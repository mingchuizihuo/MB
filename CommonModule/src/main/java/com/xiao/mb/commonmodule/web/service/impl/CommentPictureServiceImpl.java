package com.xiao.mb.commonmodule.web.service.impl;


import com.xiao.mb.commonmodule.core.generic.GenericDao;
import com.xiao.mb.commonmodule.core.generic.GenericServiceImpl;
import com.xiao.mb.commonmodule.web.dao.CommentPictureMapper;
import com.xiao.mb.commonmodule.web.domain.pojo.CommentPicture;
import com.xiao.mb.commonmodule.web.domain.pojo.CommentPictureExample;
import com.xiao.mb.commonmodule.web.service.CommentPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CommentPictureServiceImpl extends GenericServiceImpl<CommentPicture, Long,CommentPictureExample> implements CommentPictureService {
    @Autowired
    private CommentPictureMapper commentpictureMapper;

    @Override
    public GenericDao<CommentPicture, Long,CommentPictureExample> getDao() {
        return commentpictureMapper;
    }

    @Override
    public Long[] insertPictures(String pictures,byte pictureType) {
        Long[] pictureIds = new Long[pictures.split(",").length];
       if(pictures.split(",").length>0){
           int i=0;
           for (String pictureName:pictures.split(",")
                ) {
               CommentPicture commentPicture = new CommentPicture();
               commentPicture.setPictureType(pictureType);
               commentPicture.setPictureAddress(pictureName);
               if(commentpictureMapper.insert(commentPicture)!=0){
                   pictureIds[i]=commentPicture.getId();
                   i++;
               }
           }
       }
        return  pictureIds;
    }
}
