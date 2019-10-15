package com.cy.service;

import com.cy.common.vo.PageObject;
import com.cy.entity.Room;

public interface RoomService {
    PageObject<Room> findPageObjects(String username, Integer pageCurrent);
    int deleteObjects(Integer ...ids);
}
