package com.CRUD.demoCRUD.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "tb_product")
@Table(name = "tb_product")
public class Product extends BaseObject{
    @Column
    private String MaSp;
    @Column
    private String name;
    @Column
    private String quantity;
    @Column
    private String sectors;// loại hàng

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "product")
    private List<Customer> customerList;

    public String getMaSp() {
        return MaSp;
    }

    public void setMaSp(String maSp) {
        MaSp = maSp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getSectors() {
        return sectors;
    }

    public void setSectors(String sectors) {
        this.sectors = sectors;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
