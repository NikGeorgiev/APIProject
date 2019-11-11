package com.spartaglobal.HTTPServices;

import com.spartaglobal.Config.URLConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class FixerHTTPService {
    private CloseableHttpResponse fixerResponse;
    private String fixerAlbumsJSONString;

    public void executeAlbumsGetRequest() {
        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
        String albumsServiceURL = URLConfig.BASEURL;
        HttpGet httpGet = new HttpGet(albumsServiceURL);
        try {
            fixerResponse = closeableHttpClient.execute(httpGet);
            fixerAlbumsJSONString = EntityUtils.toString(fixerResponse.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getFixerAlbumsJSONString() {
        return fixerAlbumsJSONString;

    }
}
