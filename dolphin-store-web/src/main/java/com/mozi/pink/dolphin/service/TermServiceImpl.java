package com.mozi.pink.dolphin.service;

import com.mozi.pink.dolphin.consts.TermConsts;
import com.mozi.pink.dolphin.mapper.TermMapper;
import com.mozi.pink.dolphin.model.Term;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author: liuyimai
 * @Date: 2021/1/30/0030 20:37
 * @Desc:
 */
@Service
public class TermServiceImpl implements TermService {

    @Resource
    private TermMapper termMapper;

    @Resource
    private RedisTemplate redisTemplate;


    @Override
    public List<Term> listTerms() {
        Object o = redisTemplate.opsForValue().get(TermConsts.term_redis_key);
        List<Term> terms;
        if (o == null) {
            terms = termMapper.listTerms();
            redisTemplate.opsForValue().set(TermConsts.term_redis_key, terms, 60, TimeUnit.SECONDS);
        } else {
            terms = (List<Term>)o;
        }
        return terms;
    }

    @Override
    public Term getTermById(int termId) {
        return termMapper.getTermById(termId);
    }
}
