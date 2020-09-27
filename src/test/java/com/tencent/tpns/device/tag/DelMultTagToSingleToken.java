package com.tencent.tpns.device.tag;

import com.tencent.tpns.BaseXgTest;
import com.tencent.tpns.bean.*;
import org.junit.Test;

import java.util.ArrayList;

//tag测试
public class DelMultTagToSingleToken extends BaseXgTest {

    @Test
    public void testDelMultTagToSingleToken() {
        //4删除多个tag，对单个token而言

        ArrayList<String> tokenList = new ArrayList<String>();
        tokenList.add("0d7b5ab1afe4b58973b02a8c80caea51ad6e51f517de6ead3b42576653a69457");

        ArrayList<String> tagList = new ArrayList<String>();
        tagList.add("multTag1");
        tagList.add("multTag2");

        DeviceTagRequest deviceTagRequest = new DeviceTagRequest();
        deviceTagRequest.setOperator_type(OperatorType.DELE_MULT_TAGS_SINGLE.getType());
        deviceTagRequest.setPlatform(Platform.android);
        deviceTagRequest.setToken_list(tokenList);
        deviceTagRequest.setTag_list(tagList);

        System.out.println(deviceTagRequest.toString());
        System.out.println(xingeAndroid.deviceTag(deviceTagRequest.toString()));

    }


}
