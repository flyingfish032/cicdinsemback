package com.klu.travelmanagement; // ✅ match your actual main package

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = TravelManagementApplication.class) // ✅ use your real main class
class TravelManagementApplicationTests {

    @Test
    void contextLoads() {
    }
}