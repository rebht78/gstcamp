/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gstcamp.bean;

/**
 *
 * @author aziz
 */
public class ClientBean {
    String gstno;
    String clientname;
    String address;
    String state;
    String contactno;

    public ClientBean(String gstno, String clientname, String address, String state, String contactno) {
        this.gstno = gstno;
        this.clientname = clientname;
        this.address = address;
        this.state = state;
        this.contactno = contactno;
    }

    public String getGstno() {
        return gstno;
    }

    public void setGstno(String gstno) {
        this.gstno = gstno;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }
    
    
}
