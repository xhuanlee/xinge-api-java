package com.tencent.tpns.push.app;

import com.tencent.tpns.BaseXgTest;
import com.tencent.tpns.bean.ClickAction;
import com.tencent.tpns.bean.Message;
import com.tencent.tpns.bean.MessageAndroid;
import org.junit.Test;

import java.util.ArrayList;

public class PushTagAndroidTest extends BaseXgTest {

    @Test
    public void testPushTagAndroid() {


        ClickAction action = new ClickAction();
        action.setAction_type(0);
        action.setActivity("xxx");
        action.setIntent("xxx");

        MessageAndroid messageAndroid = new MessageAndroid();
        messageAndroid.setAction(action);

        messageAndroid.setBuilder_id(0);
        messageAndroid.setRing(1);
        messageAndroid.setVibrate(1);
        messageAndroid.setClearable(1);
        messageAndroid.setN_id(0);
        messageAndroid.setLights(1);
        messageAndroid.setIcon_type(0);
        messageAndroid.setStyle_id(1);


        Message message = new Message();
        message.setTitle("testPushTagAndroid");
        message.setContent("from Java SDK");

        message.setAndroid(messageAndroid);

        PushAppRequest pushAppRequest = new PushAppRequest();
        ArrayList<String> tagList = new ArrayList<String>();
        tagList.add("agtestTag");
        tagList.add("agtestTag2");
        pushAppRequest.setToken_list(tagList);
        pushAppRequest.setPush_id("0");
        pushAppRequest.setSeq(123);
        pushAppRequest.setMessage(message);
        pushAppRequest.setSend_time("1111111");
        pushAppRequest.setStat_tag("test");


        System.out.println(pushAppRequest.toString());
        for (int i=0; i< 3; i++) {
            System.out.println(xingeAndroid.pushApp(pushAppRequest.toString()));

        }



    }
}
