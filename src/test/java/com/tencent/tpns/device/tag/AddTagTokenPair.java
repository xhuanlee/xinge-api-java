package com.tencent.tpns.device.tag;

import com.tencent.tpns.BaseXgTest;
import com.tencent.tpns.bean.*;
import org.junit.Test;

import java.util.ArrayList;

//tag测试
public class AddTagTokenPair extends BaseXgTest {

    @Test
    public void testAddTagTokenPair() {
         //9批量设置标签（每次调用最多允许设置20对，每个对里面标签在前，token在后）

        ArrayList<String> tokenList = new ArrayList<String>();
        tokenList.add("0d7b5ab1afe4b58973b02a8c80caea51ad6e51f517de6ead3b42576653a69457");
        tokenList.add("22a3bad291f1a8028d0468ecc00eb7f3818b859b7ec3a0f8b8f584a22d938cf2");

        TagTokenPair tagTokenPair1 = new TagTokenPair("multTagX1","0d7b5ab1afe4b58973b02a8c80caea51ad6e51f517de6ead3b42576653a69457");
        TagTokenPair tagTokenPair2 = new TagTokenPair("multTagX2","22a3bad291f1a8028d0468ecc00eb7f3818b859b7ec3a0f8b8f584a22d938cf2");

        ArrayList<TagTokenPair> tagTokenList= new ArrayList<TagTokenPair>();
        tagTokenList.add(tagTokenPair1);
        tagTokenList.add(tagTokenPair2);

        DeviceTagRequest deviceTagRequest = new DeviceTagRequest();
        deviceTagRequest.setOperator_type(OperatorType.ADD_BATCH_TAGS.getType());
        deviceTagRequest.setPlatform(Platform.android);
        deviceTagRequest.setTag_token_list(tagTokenList);

        System.out.println(deviceTagRequest.toString());
        System.out.println(xingeAndroid.deviceTag(deviceTagRequest.toString()));

    }


}
