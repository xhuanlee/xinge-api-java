package com.tencent.tpns.device.tag;

import com.tencent.tpns.BaseXgTest;
import com.tencent.tpns.bean.*;
import org.junit.Test;

import java.util.ArrayList;

//tag测试
public class ReplaceMultTagToSingleToken extends BaseXgTest {

    @Test
    public void testReplaceMultTagToSingleToken() {
        //6标签覆盖接口（支持多个标签），对单个token而言

        ArrayList<String> tokenList = new ArrayList<String>();
        tokenList.add("0d7b5ab1afe4b58973b02a8c80caea51ad6e51f517de6ead3b42576653a69457");

        ArrayList<String> tagList = new ArrayList<String>();
        tagList.add("multTag3");
        tagList.add("multTag4");
        tagList.add("multTag5");


        DeviceTagRequest deviceTagRequest = new DeviceTagRequest();
        deviceTagRequest.setOperator_type(OperatorType.COVER_SINGLE_TAG.getType());
        deviceTagRequest.setPlatform(Platform.android);
        deviceTagRequest.setToken_list(tokenList);
        deviceTagRequest.setTag_list(tagList);

        System.out.println(deviceTagRequest.toString());
        System.out.println(xingeAndroid.deviceTag(deviceTagRequest.toString()));

    }


}
