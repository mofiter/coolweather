package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 37536 on 2017/3/9.
 */

public class Forecast {
    public String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temperature temperature;

    public class More{
        @SerializedName("txt_d")
        public String info;
    }

    public class Temperature{
        public String max;
        public String min;
    }
}
