package ir.vanosheeh.onlineshop.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Product {

    public Product() {
    }

    public Product(Integer id, String name, BigDecimal price, Integer stock, ProcuctColor color, String description, String pic) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.color = color;
        this.description = description;
        this.pic = pic;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private BigDecimal price;
    private Integer stock;
    @Enumerated(EnumType.STRING)
    private ProcuctColor color;
    private String description;
    private String pic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public ProcuctColor getColor() {
        return color;
    }

    public void setColor(ProcuctColor color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
