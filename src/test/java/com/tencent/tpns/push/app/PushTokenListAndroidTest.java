package com.tencent.tpns.push.app;

import com.tencent.tpns.BaseXgTest;
import com.tencent.tpns.bean.*;
import org.junit.Test;

import java.util.ArrayList;

public class PushTokenListAndroidTest extends BaseXgTest {

    @Test
    public void testPushTokenListAndroid() {

        MessageAndroid messageAndroid = new MessageAndroid();
        messageAndroid.setBuilder_id(0);
        messageAndroid.setRing(1);
        messageAndroid.setVibrate(1);
        messageAndroid.setClearable(1);
        messageAndroid.setN_id(0);
        messageAndroid.setLights(1);
        messageAndroid.setIcon_type(0);
        messageAndroid.setStyle_id(1);
        ClickAction action = new ClickAction();
        action.setAction_type(0);
        action.setActivity("xxx");
        action.setIntent("xxx");
        messageAndroid.setAction(action);

        Message message = new Message();
        message.setAndroid(messageAndroid);
        message.setTitle("testPushTokenListAndroid");
        message.setContent("from Java SDK");


        PushAppRequest pushAppRequest = new PushAppRequest();

        pushAppRequest.setAudience_type(AudienceType.token_list);
        pushAppRequest.setEnvironment(Environment.product);
        pushAppRequest.setMessage_type(MessageType.notify);
        pushAppRequest.setPlatform(Platform.android);
        pushAppRequest.setSeq(123);
        pushAppRequest.setPush_id("0");

        ArrayList<String> tokenList = new ArrayList<String>();
        tokenList.add("ece9c2a0fccc41554fcdad95b8a16fe4366d0404");
        tokenList.add("acefd718881b48556cd4b1df770401d3f88e424d");

        pushAppRequest.setToken_list(tokenList);
        pushAppRequest.setSend_time("1111111");
        pushAppRequest.setStat_tag("test");
        pushAppRequest.setMessage(message);

        System.out.println(pushAppRequest.toString());
        System.out.println(xingeAndroid.pushApp(pushAppRequest.toString()));

    }
}
