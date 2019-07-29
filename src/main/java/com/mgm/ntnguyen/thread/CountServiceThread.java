package com.mgm.ntnguyen.thread;

import com.mgm.ntnguyen.CountService;

public class CountServiceThread extends Thread {

  private CountService countService = CountService.getInstance();

  private final String threadName;

  public CountServiceThread(String threadName) {
    this.threadName = threadName;
  }

  @Override
  public void run() {
    countService.count(threadName);
  }
}
