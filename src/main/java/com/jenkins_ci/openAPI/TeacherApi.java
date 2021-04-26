package com.jenkins_ci.openAPI;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.jenkins_ci.Knife4jConfig;
import com.jenkins_ci.entity.Teacher;
import com.jenkins_ci.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = Knife4jConfig.TAG_1)
@RequestMapping("/teacher")
public class TeacherApi {
    @Resource
    private TeacherService teacherService;

//    @ApiOperationSupport(author="yd")
    @ApiOperation(value = "获取教师信息")
    @ApiImplicitParam(name = "id", value = "教师编号，整形，例如1、2、3", paramType = "path", required = true)
    @GetMapping("/{id}")
    public String queryById(@PathVariable int id){
        Teacher teacher = this.teacherService.queryById(id);
        return teacher.toString();
    }
}
