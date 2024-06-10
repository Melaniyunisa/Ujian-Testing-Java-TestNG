package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATMTest {

    private ATM atm;

    @BeforeMethod
    public void setUp() {
        atm = new ATM(1000.00); // saldo awal 1000.00
    }

    @Test
    public void testLihatSaldo() {
        double saldo = atm.lihatSaldo();
        Assert.assertEquals(saldo, 1000.00, "Saldo awal seharusnya 1000.00");
    }

    @Test
    public void testSetorUang() {
        atm.setorUang(500.00);
        Assert.assertEquals(atm.lihatSaldo(), 1500.00, "Saldo seharusnya bertambah menjadi 1500.00");
    }

    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "Jumlah harus lebih besar dari 0")
    public void testSetorUangInvalid() {
        atm.setorUang(-100.00);
    }

    @Test
    public void testTarikUang() {
        atm.tarikUang(200.00);
        Assert.assertEquals(atm.lihatSaldo(), 800.00, "Saldo seharusnya berkurang menjadi 800.00");
    }

    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "Saldo tidak mencukupi")
    public void testTarikUangSaldoTidakCukup() {
        atm.tarikUang(2000.00);
    }

    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "Jumlah harus lebih besar dari 0")
    public void testTarikUangInvalid() {
        atm.tarikUang(-100.00);
    }


}
