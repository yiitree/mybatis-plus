package com.demo.mybatisplus.controller;


import com.demo.mybatisplus.domain.Aaa;
import com.demo.mybatisplus.domain.User;
import com.demo.mybatisplus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zr
 * @since 2020-11-18
 */
@RestController
@RequestMapping("/xx")
public class AaaController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/xx")
    public Aaa get(){
        Aaa a = new Aaa();
        a.setVarchar1("ss");
        a.setChar1("char");
        return a;
    }

    @RequestMapping("/xxx")
    public Aaa geta(@RequestBody Aaa aaa){
        return aaa;
    }

    @RequestMapping("/xxxx")
    public Aaa getaa(Aaa aaa){
        return aaa;
    }

    @RequestMapping("/6")
    public Object getaa(){
        Collection<Serializable> idList=new ArrayList<Serializable>();
        idList.add(3);
        idList.add(4);
        idList.add(5);
        List<User> list = userMapper.selectBatchIds(idList);
        return list;
    }

}

