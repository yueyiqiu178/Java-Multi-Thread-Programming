package com.multi.thread.chapter8.section2.example6;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class MyServiceA {
	public TransferQueue queue = new LinkedTransferQueue();
}
