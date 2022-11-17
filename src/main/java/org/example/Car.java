package org.example;


import lombok.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Car {
    public int tankFullness;
    private int fuelConsumption;
    private Date technicalInspectionDate;

    public Car(int tankFullness, int fuelConsumption, String technicalInspectionDate) {
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd.MM.yyyy");
        try {
            this.technicalInspectionDate = format.parse("11.12.2021");
        } catch (Exception e){

        }

        this.tankFullness = tankFullness;
        this.fuelConsumption = fuelConsumption;
    }

    public boolean isDrivable(){
        return tankFullness > 0;
    }

    public boolean canBeDriven(){
        Date date = new Date();
        long milliseconds = date.getTime() - technicalInspectionDate.getTime();
        int days = (int) (milliseconds / (24*60*60*1000));
        if (days <= 730) return true;
        else  return false;
    }

    public String distanceCanBeDriven(){
        return String.format("%.2f", tankFullness / fuelConsumption * 1.0);
    }
}