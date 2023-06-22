package org.example.model;

import java.time.LocalDate;
import lombok.Data;

@Data
public class VirtualProduct extends Product {
    private String code;
    private LocalDate expirationDate;

    public VirtualProduct(String name, double price, String code, LocalDate expirationDate) {
        super(name, price);
        this.code = code;
        this.expirationDate = expirationDate;
    }
}
