package com.mozi.pink.dolphin.service;

import com.mozi.pink.dolphin.model.Term;

import java.util.List;

/**
 * @Author: liuyimai
 * @Date: 2021/1/30/0030 20:31
 * @Desc:
 */
public interface TermService {

    List<Term> listTerms();

    Term getTermById(int termId);

}
