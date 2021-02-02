package com.ly.controller;

import com.ly.bean.ImoocClass;
import com.ly.mapper.ImoocClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ImoocClassController {

    @Autowired
    private ImoocClassMapper imoocClassMapper;

    @GetMapping("/queryImoc/{id}")
    public ImoocClass getImoc(@PathVariable Integer id){
        return imoocClassMapper.getClassById(id);
    }

    @GetMapping("/Imoc")
    public ImoocClass inertImoc(ImoocClass imoocClass){
        imoocClassMapper.insertImoc(imoocClass);
        return imoocClass;
    }

}
