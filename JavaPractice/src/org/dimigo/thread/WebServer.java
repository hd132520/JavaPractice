package org.dimigo.thread;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * <pre>
 * org.dimigo.thread
 *   |_ WebServer
 * 
 * 1. 媛쒖슂 : 
 * 2. �옉�꽦�씪 : 2015. 10. 29.
 * </pre>
 *
 * @author		: �씠由�
 * @version		: 1.0
 */
public class WebServer {
	  
	public static void main(String argv[]) throws Exception {
		
        // �꽌踰꾩냼耳볦쓣 �깮�꽦�븳�떎. �쎒�꽌踰꾨뒗 湲곕낯�쟻�쑝濡� 80踰� �룷�듃瑜� �궗�슜�븳�떎.
        try(ServerSocket listenSocket = new ServerSocket(80)) {
	        System.out.println("Webserver starting up on port 80");
	        System.out.println("(press ctrl-c to exit)");
	        
	        Socket connectionSocket;
	        Thread serverThread;
	  
	        // 諛섎났臾몄쓣 �룎硫댁꽌 �겢�씪�씠�뼵�듃�쓽 �젒�냽�쓣 諛쏅뒗�떎.
	        while((connectionSocket = listenSocket.accept()) != null) {
	            // �뒪�젅�뱶瑜� �깮�꽦�븯�뿬 �떎�뻾�븳�떎.
	            serverThread = new Thread(new ServerThread3(connectionSocket));
	            serverThread.start();
	        }
	        
        } catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
