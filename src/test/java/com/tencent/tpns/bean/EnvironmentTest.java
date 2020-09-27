package com.tencent.tpns.bean;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnvironmentTest {

    @Test
    public void testGetName() {
        ObjectMapper mapper = new ObjectMapper();
        String repoStr = null;
        try {
            assertEquals("product", String.valueOf(Environment.product));

        } catch (Exception e) {
            fail();
        }
    }
}