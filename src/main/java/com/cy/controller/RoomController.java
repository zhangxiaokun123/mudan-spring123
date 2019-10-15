package com.cy.controller;


import com.cy.common.vo.JsonResult;

import com.cy.common.vo.PageObject;
import com.cy.entity.Room;
import com.cy.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/log/")
public class RoomController {
    @Autowired    private RoomService roomService;
    @RequestMapping("doFindPageObjects")
    @ResponseBody
    public JsonResult doFindPageObjects(String username, Integer pageCurrent){
        PageObject<Room> pageObject=
                roomService.findPageObjects(username,pageCurrent);
        return new JsonResult(pageObject);
    }
    @RequestMapping("doDeleteObjects")
    @ResponseBody
    public JsonResult doDeleteObjects(Integer ...ids){
        roomService.deleteObjects(ids);
        return new JsonResult("delete ok");
    }

}
