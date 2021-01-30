package com.mozi.pink.dolphin.mapper;


import com.mozi.pink.dolphin.model.Term;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: liuyimai
 * @Date: 2021/1/30/0030 20:23
 * @Desc:
 */
public interface TermMapper {

    @Select("select * from test.zsy_term")
    List<Term> listTerms();

    /**
     * @param termId
     * @return
     */
    Term getTermById(int termId);

}
