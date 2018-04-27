package com.example.springbootmysql.controller;




import com.example.springbootmysql.service.ReconWarningInfoService;
import com.example.springbootmysql.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 * @Package: com.example.springbootdemo.controller
 * @ClassName: ReconWarningInfoController
 * @Description: 异常预警
 * @Author: 王建岭
 * @CreateDate: 2018/4/6 下午9:51
 */

@RestController
@RequestMapping("/reconWarning")
public class ReconWarningInfoController {

     @Autowired
     ReconWarningInfoService reconWarningInfoService;

     @RequestMapping("/list")
     public R list(){
          try {
               return R.ok().put("list",Optional.of(reconWarningInfoService.getReconWarningList()).get());
          }catch(Exception e){
               return R.error(-1,"服务器异常");
          }

     }

     public static void main(String[] args) {

          List<String> list = new ArrayList<>();
          Optional.of(list);
          System.out.println(11);

     }


     }
