package com.qfedu.logo.pojo;

public class Type {
    private Integer tid;

    private String typeName;

    private String typeTdescs;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getTypeTdescs() {
        return typeTdescs;
    }

    public void setTypeTdescs(String typeTdescs) {
        this.typeTdescs = typeTdescs == null ? null : typeTdescs.trim();
    }
}