package com.fish.springbootlearn.ControllerLearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 读取配置类
 */
@RestController
public class ConfigController {
    @Autowired//自动引入
    SchoolConfig schoolConfig;
    @GetMapping({"/gradefromconfig"})
    public String gradeclass(){
        return "年级:"+schoolConfig.grade+"班级:"+schoolConfig.classnum;
    }
}