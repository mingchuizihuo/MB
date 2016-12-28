package com.xiao.mb.commonmodule.web.service.impl;


import com.xiao.mb.commonmodule.core.generic.GenericDao;
import com.xiao.mb.commonmodule.core.generic.GenericServiceImpl;
import com.xiao.mb.commonmodule.web.dao.CommentRichTextMapper;
import com.xiao.mb.commonmodule.web.domain.pojo.CommentRichText;
import com.xiao.mb.commonmodule.web.domain.pojo.CommentRichTextExample;
import com.xiao.mb.commonmodule.web.service.CommentRichTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CommentRichTextServiceImpl extends GenericServiceImpl<CommentRichText, Long,CommentRichTextExample> implements CommentRichTextService {
    @Autowired
    private CommentRichTextMapper commentrichtextDao;
    @Override
    public GenericDao<CommentRichText, Long,CommentRichTextExample> getDao() {
        return commentrichtextDao;
    }

}
