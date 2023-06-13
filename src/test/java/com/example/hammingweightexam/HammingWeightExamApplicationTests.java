package com.example.hammingweightexam;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HammingWeightExamApplicationTests {

    @Test
    void HammingWeightTest1(){

        int res = HammingController.getHammingWeight("030202");
        assertEquals(3, res);
    }


}
