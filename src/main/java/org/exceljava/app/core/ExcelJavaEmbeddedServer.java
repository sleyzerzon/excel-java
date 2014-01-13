package org.exceljava.app.core;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class ExcelJavaEmbeddedServer extends AbstractHandler{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Server jettyServer = new Server(8080);
		jettyServer.setHandler(new ExcelJavaEmbeddedServer());
		
		jettyServer.start();
		jettyServer.join();
		
	}

	public void handle(String target, Request baseRequest, HttpServletRequest httpRequest,
			HttpServletResponse httpResponse) throws IOException, ServletException {
		
		httpResponse.setContentType("text/html; charset=utf-8");
		httpResponse.setStatus(HttpServletResponse.SC_OK);
		baseRequest.setHandled(true);
		httpResponse.getWriter().println("<h1>Hello, Jetty://</h1");		
	}

}
