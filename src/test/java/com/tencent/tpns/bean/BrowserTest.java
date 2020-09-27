package com.tencent.tpns.bean;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.junit.Assert.*;

public class BrowserTest {

    @Test
    public void testBrowser() {

        Browser browser = new Browser();
        browser.setConfirm(1);
        browser.setUrl("xxxx");

        ObjectMapper mapper = new ObjectMapper();


        String repoStr = null;
        try {
            repoStr = mapper.writeValueAsString(browser);

        } catch (Exception e) {
           fail();
        }

        assertEquals("{\"url\":\"xxxx\",\"confirm\":1}", repoStr);

    }
}