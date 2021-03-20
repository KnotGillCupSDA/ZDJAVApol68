package com.sda.zdjavapol68.example.zad8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ParcelValidatorTest {

    private Validator validator;

    @BeforeEach
    void setUp() {
        validator = new ParcelValidatorDawid();
    }

    @Test
    void testStandardParcelHappyPath() {
        Parcel parcel = new Parcel(31, 32, 33, 19.0f, false);
        Assertions.assertTrue(validator.validate(parcel));
    }

    @Test
    void testExpressParcelHappyPath() {
        Parcel parcel = new Parcel(31, 32, 33, 13.0f, true);
        Assertions.assertTrue(validator.validate(parcel));
    }

    @Test
    void thatIsNotValidWhenSumOfLengthsIsTooHigh() {
        Parcel parcel = new Parcel(240, 31, 32, 1, false);
        Assertions.assertFalse(validator.validate(parcel));
    }

    @Test
    void thatIsNotValidWhenAnyDimensionIsTooLow() {
        List<Parcel> parcels = Arrays.asList(
                new Parcel(1, 31, 31, 1, false),
                new Parcel(31, 1, 31, 1, false),
                new Parcel(31, 31, 1, 1, false));

        for (Parcel parcel : parcels) {
            Assertions.assertFalse(validator.validate(parcel));
        }
    }

    @Test
    void thatIsNotValidWhenTooHeavyStandard() {
        Parcel parcel = new Parcel(10, 10, 10, 34, false);
        Assertions.assertFalse(validator.validate(parcel));
    }

    @Test
    void thatIsNotValidWhenTooHeavyExpress() {
        Parcel parcel = new Parcel(10, 10, 10, 17, true);
        Assertions.assertFalse(validator.validate(parcel));
    }
}