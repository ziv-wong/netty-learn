package cn.ziv.chapter2;


import cn.ziv.chapter2.echoclient.EchoClient;

/**
 * Hello world!
 *
 */
public class EchoClientBoot
{
    public static void main( String[] args ) throws Exception {
        new cn.ziv.chapter2.echoclient.EchoClient("127.0.0.1", 9000).start();
    }
}
