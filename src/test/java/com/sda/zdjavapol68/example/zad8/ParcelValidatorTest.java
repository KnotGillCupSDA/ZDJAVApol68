package com.sda.zdjavapol68.example.zad8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParcelValidatorTest {

    @Test
    void testStandardParcelHappyPath() {
        Parcel parcel = new Parcel();
        ParcelValidator parcelValidator = new ParcelValidator();
        Assertions.assertTrue(parcelValidator.validate(parcel));
    }
}