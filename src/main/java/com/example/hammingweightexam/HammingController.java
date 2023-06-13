package com.example.hammingweightexam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class HammingController {
    int visitCounter = 0;
    @RequestMapping("/counter")
    public int getVisitCounter(){
        visitCounter++;
        return visitCounter;
}
    @RequestMapping("/getweight")
    public static int getHammingWeight(@RequestParam String text){
        int hammingWeight = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == '0')
                hammingWeight++;
        }

        return hammingWeight;
}

}
