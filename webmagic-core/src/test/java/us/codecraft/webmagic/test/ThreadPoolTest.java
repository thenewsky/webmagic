package us.codecraft.webmagic.test;

import com.google.common.collect.Lists;
import freemarker.template.utility.DateUtil;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.codecraft.webmagic.*;
import us.codecraft.webmagic.downloader.Downloader;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.pipeline.CollectorPipeline;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.pipeline.ResultItemsCollectorPipeline;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.scheduler.QueueScheduler;
import us.codecraft.webmagic.scheduler.Scheduler;
import us.codecraft.webmagic.thread.CountableThreadPool;
import us.codecraft.webmagic.utils.UrlUtils;

import java.io.Closeable;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


public class ThreadPoolTest {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    protected static  ExecutorService executorService;
    protected static CountableThreadPool threadPool;


    final static int  threadNum = 10;


    static  {
        if (threadPool == null || threadPool.isShutdown()) {

            if (executorService != null && !executorService.isShutdown()) {
                threadPool = new CountableThreadPool(threadNum, executorService);
            } else {
                threadPool = new CountableThreadPool(threadNum);
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {

        Thread thisThread = Thread.currentThread();
        for (int i = 0; i < 1000; i++) {

            if (i > 0) {
                thisThread.sleep(1000);//5s 添加一线程
            }

            final int finalI = i;
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("-----begin------ thred "+ finalI +" time:"+getNowStr()+"-threadName"+Thread.currentThread().getName());
                    try {
                        Thread.currentThread().sleep(20000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("-----end------ thred "+ finalI +" time:"+getNowStr());
                }
            });

        }
    }


    public static String getNowStr() {
        Date now = new Date();
        return now.getHours() + "-" + now.getMinutes() + "-" + now.getSeconds();
    }
}
