package com.example.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;
import org.json.JSONException;
import org.json.JSONObject;

public class Info extends AppCompatActivity {

    TextView confirmed_num , active_num , recovered_num , death_num , total_num , cont_num;
    private RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        cont_num = findViewById(R.id.cont_num);
        confirmed_num = findViewById(R.id.confirmed_num);
        active_num = findViewById(R.id.active_num);
        recovered_num = findViewById(R.id.recovered_num);
        death_num = findViewById(R.id.death_num);
        total_num = findViewById(R.id.total_num);

        requestQueue = Volley.newRequestQueue(this);

        String url = "https://corona.lmao.ninja/v2/all";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                JSONObject jsonObject = null;
                try {
                     String conf = response.getString("cases");
                     String actv = response.getString("active");
                     String recv = response.getString("recovered");
                     String dth = response.getString("deaths");
                     String total = response.getString("tests");
                     String cont = response.getString("affectedCountries");


                    PieChart mPieChart = (PieChart) findViewById(R.id.piechart);

                    mPieChart.addPieSlice(new PieModel("Confirmed",Integer.parseInt(conf) , Color.parseColor("#D32F2F")));
                    mPieChart.addPieSlice(new PieModel("Active", Integer.parseInt(actv), Color.parseColor("#1976D2")));
                    mPieChart.addPieSlice(new PieModel("Recovered", Integer.parseInt(recv), Color.parseColor("#388E3C")));
                    mPieChart.addPieSlice(new PieModel("Deaths", Integer.parseInt(dth), Color.parseColor("#FBC02D")));

                    mPieChart.startAnimation();


                    confirmed_num.setText(conf);
                        active_num.setText(actv);
                        recovered_num.setText(recv);
                        death_num.setText(dth);
                        total_num.setText(total);
                        cont_num.setText(cont);


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        requestQueue.add(request);

    }
}
