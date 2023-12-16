// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

package org.example.data;
import java.util.List;

public class Car {
    private String color;
    private long year;
    private String price;
    private String model;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", price='" + price + '\'' +
                ", model='" + model + '\'' +
                ", id=" + id +
                ", make='" + make + '\'' +
                '}';
    }

    private long id;
    private String make;

    public String getColor() { return color; }
    public void setColor(String value) { this.color = value; }

    public long getYear() { return year; }
    public void setYear(long value) { this.year = value; }

    public String getPrice() { return price; }
    public void setPrice(String value) { this.price = value; }
    public float getPriceInt(){
        return  Float.parseFloat(this.price);
    }
    public String getModel() { return model; }
    public void setModel(String value) { this.model = value; }

    public long getid() { return id; }
    public void setid(long value) { this.id = value; }

    public String getMake() { return make; }

    public void setMake(String value) { this.make = value; }
}
