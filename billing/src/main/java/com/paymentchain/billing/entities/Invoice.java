/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paymentchain.billing.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
//@Schema(name = "Invoice", description = "Model represent a invoice on database")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    //@Schema(name = "customerId", required = true, example = "2", defaultValue = "1", description = "Unique Id of customer that represent the owner of invoice")
    private long customerId;
    //@Schema(name = "number", required = true, example = "3", defaultValue = "8", description = "Number given on fisical invoice")
    private String number;
    private String detail;
    private double amount;
}
