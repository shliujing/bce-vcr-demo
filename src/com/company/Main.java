package com.company;

import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.services.vcr.VcrClient;
import com.baidubce.services.vcr.model.PutImageResponse;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String ACCESS_KEY_ID = "";
        String SECRET_ACCESS_KEY = "";
        String IMG_Url = "https://lj-test-bucket.bj.bcebos.com/43bf1b631e83__pulp.png";

        // 初始化一个VcrClient
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ACCESS_KEY_ID, SECRET_ACCESS_KEY));
        // 如果有需要，可以用https协议
        config.setEndpoint("http://vcr.bj.baidubce.com");
        VcrClient vcrClient = new VcrClient(config);
        PutImageResponse response = vcrClient.putImage(IMG_Url);
        System.out.println("Result:");
        System.out.println(response.toString());
    }
}
