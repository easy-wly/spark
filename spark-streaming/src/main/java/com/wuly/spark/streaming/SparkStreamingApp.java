package com.wuly.spark.streaming;

import org.apache.spark.SparkConf;
import org.apache.spark.streaming.Duration;
import org.apache.spark.streaming.api.java.JavaStreamingContext;

/**
 * SparkStreaming
 *
 * @author wuly
 * @since 2022/04/23
 */
public class SparkStreamingApp {

    public void initApp() {
        SparkConf conf = new SparkConf().setAppName("wly-spark-streaming").setMaster("local[3]");
        JavaStreamingContext ssc = new JavaStreamingContext(conf, new Duration(1000));

    }
}
