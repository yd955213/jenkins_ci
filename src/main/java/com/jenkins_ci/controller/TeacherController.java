package com.jenkins_ci.controller;

import com.jenkins_ci.entity.Teacher;
import com.jenkins_ci.service.TeacherService;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;

/**
 * (Teacher)表控制层
 *
 * @author makejava
 * @since 2021-04-27 09:37:36
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    /**
     * 服务对象
     */
    @Resource
    private TeacherService teacherService;

    /**
     * 通过主键查询单条数据
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne/{id}")
    public String selectOne(@PathVariable Integer id) {
        Teacher teacher = this.teacherService.queryById(id);
        String s = teacher ==null? "t_id 不存在":teacher.toString();

        System.out.println(s);
        return s;
    }

}
