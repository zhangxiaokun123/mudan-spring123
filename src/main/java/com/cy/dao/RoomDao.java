package com.cy.dao;




import com.cy.entity.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface RoomDao {
//    @Select("select *\n" +
//            "        from room order by room_id desc\n" +
//            "        limit #{startIndex},#{pageSize}")
    List<Room> findPageObjects(
            @Param("username")String  username,
            @Param("startIndex")Integer startIndex,
            @Param("pageSize")Integer pageSize);
//    @Select("select count(*)\n" +
//            "        from room")
    int getRowCount(@Param("username") String username);
    int deleteObjects(@Param("ids")Integer ...ids);

}
