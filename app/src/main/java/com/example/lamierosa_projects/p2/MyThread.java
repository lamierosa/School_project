package com.example.androidosipov.p2;

import android.os.Handler;
import android.os.Message;

public class MyThread extends Thread {
    Handler handler;
    public MyThread(Handler handler) {
        this.handler = handler;
    }
    public void run() {
        try {
            Thread.sleep(10000);
            Message message = new Message();
            message.obj = "Файл загружен";
            handler.sendMessage(message);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
