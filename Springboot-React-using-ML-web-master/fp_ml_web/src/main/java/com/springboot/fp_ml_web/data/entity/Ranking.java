package com.springboot.fp_ml_web.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Data
@Entity
public class Ranking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rankingId;
    private int userSelectionId;
    private String serviceIndustryName;
    private String districtName;
    private BigInteger predictedSalesAmountMonth;
    private double rentFee;
    private String rentFeeScale;
}
