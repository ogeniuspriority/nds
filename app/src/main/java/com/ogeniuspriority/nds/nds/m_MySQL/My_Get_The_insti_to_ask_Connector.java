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
public class My_Get_The_insti_to_ask_Connector {
    public static HttpURLConnection connect(String urlAddress) {

        try {

            URL url = new URL(urlAddress);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            //Log.w("0000",""+Urubuga_Services.whichTypeOfData_Keys[Urubuga_Services.whichTypeOfData-1]);

            //--con properties-
            String data = "";

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
