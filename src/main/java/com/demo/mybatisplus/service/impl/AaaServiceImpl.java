package com.demo.mybatisplus.service.impl;

import com.demo.mybatisplus.domain.Aaa;
import com.demo.mybatisplus.mapper.AaaMapper;
import com.demo.mybatisplus.service.AaaService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zr
 * @since 2020-11-18
 */
@Service
public class AaaServiceImpl extends ServiceImpl<AaaMapper, Aaa> implements AaaService {

}
