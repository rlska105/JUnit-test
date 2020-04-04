package com.example.calculation.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@RunWith(SpringRunner.class)
@WebMvcTest
public class SomeControllerTest {

    @Autowired
    private MockMvc mvc; //com.example.calculation.web API test할 때 사용. spring MVC test의 시작점.

    @Test
    public void sample() throws Exception { //throws Exception 필수!
        String sample = "Sample";

        mvc.perform(get("/sample"))
                .andExpect(status().isOk())
                .andExpect(content().string(sample));
    }
}