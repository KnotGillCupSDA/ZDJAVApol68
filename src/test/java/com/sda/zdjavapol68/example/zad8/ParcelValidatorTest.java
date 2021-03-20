package com.sda.zdjavapol68.example.zad8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParcelValidatorTest {

    @Test
    void testStandardParcelHappyPath() {
        Parcel parcel = new Parcel(31, 32, 33, 19.0f, false);
        ParcelValidator parcelValidator = new ParcelValidator();
        Assertions.assertTrue(parcelValidator.validate(parcel));
    }
}