package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppCtx;
import spring.Client;

public class Main {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		Client client1 = ctx.getBean(Client.class);
		Client client2 = ctx.getBean(Client.class);
//		client.send();
		System.out.println("client1==client2 ? "+(client1==client2));
		client1.destroy();
		client2.destroy();
		
		
		ctx.close();
	}
	
	
}
