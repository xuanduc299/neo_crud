package com.CRUD.demoCRUD.dto;

import com.CRUD.demoCRUD.entity.Product;

import java.util.List;
import java.util.UUID;

public class ProductDTO extends BaseObjectDto {

    private String MaSp;

    private String name;

    private String quantity;

    private String sectors;

    private List<CustomerDTO> customerDto;

    public ProductDTO() {
    }

    public ProductDTO(UUID id) {
        this.setId(id);
    }

    public ProductDTO(Product entity) {
        if (entity != null) {
            this.setId(entity.getId());
            this.setMaSp(entity.getMaSp());
            this.setName(entity.getName());
            this.setQuantity(entity.getQuantity());
            this.setSectors(entity.getSectors());
        }
    }

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

    public List<CustomerDTO> getCustomerDto() {
        return customerDto;
    }

    public void setCustomerDto(List<CustomerDTO> customerDto) {
        this.customerDto = customerDto;
    }
}
