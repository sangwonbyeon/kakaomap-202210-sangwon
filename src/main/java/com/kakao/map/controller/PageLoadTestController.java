package com.kakao.map.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageLoadTestController {

    @RequestMapping(value = "/t1", method = RequestMethod.GET) //value = "/t1" 메시지 값
    public String text1(){  //호출
        System.out.println("t1요청 들어옴?");
        return "test1";  //return 응답
    }
    @RequestMapping(value = "/t2", method = RequestMethod.GET)
    public String text2(){
        System.out.println("t2요청 들어옴?");
        return "test1";
    }
    @RequestMapping(value = "/test/page" , method = RequestMethod.GET)
    public String text() {
        return "test/test2";
    }
    @RequestMapping(value = "/kakaomap" , method = RequestMethod.GET)
    public String kakaomap(){
        return "kakaomap";
    }
}

//url: text.page  method: GET
