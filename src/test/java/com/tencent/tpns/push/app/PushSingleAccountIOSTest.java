package com.tencent.tpns.push.app;

import com.tencent.tpns.BaseXgTest;
import com.tencent.tpns.bean.*;
import com.tencent.tpns.bean.ios.Alert;
import com.tencent.tpns.bean.ios.Aps;
import org.junit.Test;

import java.util.ArrayList;

//ios account单推
public class PushSingleAccountIOSTest extends BaseXgTest {

    @Test
    public void testPushSingleAccountIOS() {

        Message message = new Message();
        message.setContent("testPushSingleAccountIOS from Java API");
        message.setTitle("testPushSingleAccountIOS");


        MessageIOS msgIOS = new MessageIOS();
        Alert alert = new Alert();
        alert.setTitle("alert from Java API");
        alert.setBody(" body alert from Java API");

        Aps aps = new Aps();
        aps.setBadge_type(8);
        aps.setAlert(alert);
        msgIOS.setAps(aps);

        message.setIos(msgIOS);

        ArrayList<String> accountList = new ArrayList<String>();
        accountList.add("xg_account");

        PushAppRequest pushAppRequest = new PushAppRequest();
        pushAppRequest.setPlatform(Platform.ios);
        pushAppRequest.setEnvironment(Environment.dev);
        pushAppRequest.setMessage_type(MessageType.notify);
        pushAppRequest.setMessage(message);
        pushAppRequest.setSend_time("2018-10-10 10:49:22");
        pushAppRequest.setStat_tag("test");
        pushAppRequest.setPush_id("0");
        pushAppRequest.setAccount_list(accountList);
        pushAppRequest.setAudience_type(AudienceType.account);

        System.out.println(pushAppRequest.toString());
        System.out.println(xingeIOS.pushApp(pushAppRequest.toString()));

    }
}
