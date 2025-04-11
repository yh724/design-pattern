package com.jiayuan.builder.simple;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/7 15:34<br/>
 */
public class Phone {
    private String brand;

    private String cpu;

    private String ram;

    private String storage;

    private String price;

    private Phone(PhoneBuilder builder) {
        brand = builder.brand;
        cpu = builder.cpu;
        ram = builder.ram;
        storage = builder.storage;
        price = builder.price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public static class PhoneBuilder {
        private String brand;

        private String cpu;

        private String ram;

        private String storage;

        private String price;

        public PhoneBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public PhoneBuilder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public PhoneBuilder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public PhoneBuilder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public PhoneBuilder price(String price) {
            this.price = price;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }



}
