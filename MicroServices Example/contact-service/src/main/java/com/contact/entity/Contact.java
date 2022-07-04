package com.contact.entity;

public class Contact {
    private Long cid;
    private String cName;
    private String phone_no;
    private Long userId;

    public Contact(Long cid, String cName, String phone_no, Long userId) {
        this.cid = cid;
        this.cName = cName;
        this.phone_no = phone_no;
        this.userId = userId;
    }

    public Contact() {
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "cid=" + cid +
                ", cName='" + cName + '\'' +
                ", phone_no='" + phone_no + '\'' +
                ", userId=" + userId +
                '}';
    }
}
