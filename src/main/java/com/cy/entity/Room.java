package com.cy.entity;


public class Room {
    private Integer id;
    private Integer roomId;
    private Integer personNumber;
    private String roomStatement;
    private String customerName;
    private String roomTel;
    private Double roomPrice;
    private String roomProperty;
    private Double roomPricemin;
    private Double roomPricemax;
    public String getRoomProperty() {
        return roomProperty;
    }

    public void setRoomProperty(String roomProperty) {
        this.roomProperty = roomProperty;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomId=" + roomId +
                ", personNumber=" + personNumber +
                ", roomStatement='" + roomStatement + '\'' +
                ", customerName='" + customerName + '\'' +
                ", roomTel='" + roomTel + '\'' +
                ", roomPrice='" + roomPrice + '\'' +
                ", roomProperty='" + roomProperty + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(Integer personNumber) {
        this.personNumber = personNumber;
    }

    public String getRoomStatement() {
        return roomStatement;
    }

    public void setRoomStatement(String roomStatement) {
        this.roomStatement = roomStatement;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getRoomTel() {
        return roomTel;
    }

    public void setRoomTel(String roomTel) {
        this.roomTel = roomTel;
    }

    public Double getRoomPrice() {
        return roomPrice;
    }

    public Double getRoomPricemin() {
        return roomPricemin;
    }

    public void setRoomPricemin(Double roomPricemin) {
        this.roomPricemin = roomPricemin;
    }

    public Double getRoomPricemax() {
        return roomPricemax;
    }

    public void setRoomPricemax(Double roomPricemax) {
        this.roomPricemax = roomPricemax;
    }

    public void setRoomPrice(Double roomPrice) {
        this.roomPrice = roomPrice;
    }



}
