package com.test.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@MapperScan("com.test.app.mapper")
public class Application {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("                   _ooOoo_\n");
		sb.append("                  o8888888o\n");
		sb.append("                  88\" . \"88\n");
		sb.append("                  (| -_- |)\n");
		sb.append("                  O\\  =  /O\n");
		sb.append("               ____/`---'\\____\n");
		sb.append("             .'  \\\\|     |//  `.\n");
		sb.append("            /  \\\\|||  :  |||//  \\ \n");
		sb.append("           /  _||||| -:- |||||-  \\ \n");
		sb.append("           |   | \\\\\\  -  /// |   |\n");
		sb.append("           | \\_|  ''\\---/''  |   |\n");
		sb.append("           \\  .-\\__  `-`  ___/-. /\n");
		sb.append("         ___`. .'  /--.--\\  `. . __\n");
		sb.append("      .\"\" '<  `.___\\_<|>_/___.'  >'\"\".\n");
		sb.append("     | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |\n");
		sb.append("     \\  \\ `-.   \\_ __\\ /__ _/   .-` /  /\n");
		sb.append("======`-.____`-.___\\_____/___.-`____.-'======\n");
		sb.append("                   `=---='\n");
		sb.append("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
		sb.append("\t\t佛祖保佑       永无BUG\n");
		System.out.println(sb.toString());
		SpringApplication.run(Application.class, args);
	}
}
