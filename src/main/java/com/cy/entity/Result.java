package com.cy.entity;


    public class Result<T> {
        //返回信息
        private String msg;
        //数据是否正常请求
        private boolean success;
        //具体返回的数据
        private T detail;

        public T getDetail() {
            return detail;
        }

        public String getMsg() {
            return msg;
        }

        public void setDetail(T detail) {
            this.detail = detail;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }
        public boolean getSuccess(){
            return success;
        }


    }
