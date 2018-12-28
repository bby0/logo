package com.qfedu.logo.pojo;

public class AddressDetail {
    private Integer aId;

    private Integer uId;

    private String address;

    private Integer status;

    private String postcode;
    
    private Users users;
    
    public Users getUsers() {
        return users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
    
    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }
}