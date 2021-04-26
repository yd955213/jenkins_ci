package com.jenkins_ci.openAPI;

import com.jenkins_ci.service.TeacherService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
class TeacherApiTest {

    @Resource
    private TeacherService teacherService;

    @Test
    void queryById(){

    }

    @Test
    void selectOne(){
        System.out.println(this.teacherService.queryById(1).getTName());
    }

}