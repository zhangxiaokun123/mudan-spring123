package com.cy.dao;




import com.cy.entity.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface RoomDao {
    List<Room> findPageObjects(
            @Param("username")String  username,
            @Param("startIndex")Integer startIndex,
            @Param("pageSize")Integer pageSize);

    int getRowCount(@Param("username") String username);
    int deleteObjects(@Param("ids")Integer ...ids);

}
