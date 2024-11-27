package com.gym.barcode.gym_barcode_generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.gym.barcode")
public class GymBarcodeGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(GymBarcodeGeneratorApplication.class, args);
    }
}
