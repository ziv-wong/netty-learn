package cn.ziv.chapter2;

import cn.ziv.chapter2.echoserver.EchoServer;

/**
 * Hello world!
 *
 */
public class EchoServerBoot
{
    public static void main( String[] args ) throws InterruptedException {
        new cn.ziv.chapter2.echoserver.EchoServer(9000).start();
    }
}
