package com.ogeniuspriority.nds.nds.m_MySQL;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by USER on 2/6/2017.
 */
public class My_Community_Posts_Connector_LikeOrUnlike {
    public static HttpURLConnection connect(String urlAddress,String postId, String likeOrDislikeTag,String likeOrDislikePosterId) {

        try {

            URL url = new URL(urlAddress);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
           // Log.w("0000",""+Urubuga_Services.whichTypeOfData_Keys[Urubuga_Services.whichTypeOfData-1]);
            //--con properties-
            String data = "";
            data = URLEncoder.encode("postId", "UTF-8")
                    + "=" + URLEncoder.encode(postId, "UTF-8");
            data += "&" + URLEncoder.encode("likeOrDislikeTag", "UTF-8") + "="
                    + URLEncoder.encode(likeOrDislikeTag, "UTF-8");
            data += "&" + URLEncoder.encode("likeOrDislikePosterId", "UTF-8") + "="
                    + URLEncoder.encode(likeOrDislikePosterId, "UTF-8");
            String lastResort = data;
            String urlParameters = lastResort;
            con.setRequestMethod("POST");
            con.setConnectTimeout(15000);
            con.setReadTimeout(15000);
            con.setDoInput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(urlParameters);
            wr.flush();
            wr.close();


            return con;


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
