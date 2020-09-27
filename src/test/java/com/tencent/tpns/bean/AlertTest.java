package com.tencent.tpns.bean;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tencent.tpns.bean.ios.Alert;
import org.junit.Test;

public class AlertTest {

    @Test
    public void testAlert() {

        Alert alert = new Alert();
        alert.setBody("alert-body");
        alert.setTitle("alert-title");
        ObjectMapper mapper = new ObjectMapper();
        try {
            String rest =  mapper.writeValueAsString(alert);
            System.out.println(rest);

        } catch (Exception e) {

        }
    }
}