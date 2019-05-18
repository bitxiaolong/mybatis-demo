package com.controller;


import com.domain.Student;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService iStudentService;

    @RequestMapping(value = "/allStudent",method = RequestMethod.GET)
    public String allStudent(Model model){
        List<Student> list = iStudentService.queryAllStudent();
        model.addAttribute("list", list);
        return "allStudent";
    }

//    @RequestMapping(value = "/allStudent",method = RequestMethod.GET)
//    public String allStudent(@RequestParam(required = false,defaultValue = "1") Model model){
//        PageHelper.startPage(3,2);
//        List<Student> list = iStudentService.queryAllStudent();
//        PageInfo<Student> p =new PageInfo<Student>(list);
//        model.addAttribute("page",p);
//        model.addAttribute("list",list);
//        return "allStudent";
//    }

    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    public String addStudent(Student student){
        iStudentService.addStudent(student);
        return "redirect:/student/allStudent";
    }
     @RequestMapping(value = "/deleStudent/{id}",method = RequestMethod.DELETE)
     public String deleStudent(@PathVariable("id") int id) {
         int i = iStudentService.deleteById(id);
         System.out.println(i);
         return "redirect:/student/allStudent";
    }

    @RequestMapping(value = "/updateStudent",method = RequestMethod.PUT)
    public String updateStudent(Student student){
        iStudentService.updateStudent(student);
        return "update";
    }
}
