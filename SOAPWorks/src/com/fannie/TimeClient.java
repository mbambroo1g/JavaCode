package com.fannie;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

class TimeClient {
	public static void main(String args[ ]) throws MalformedURLException {
		URL url = new URL("http://localhost:8896/nav?wsdl");
		// Qualified name of the service:
		// 1st arg is the service URI
		// 2nd is the service name published in the WSDL
		String serviceName = "TimeServerImplService";
		String portInfo = "http://fannie.com/";
		QName qname = new QName(portInfo,serviceName);
		// Create, in effect, a factory for the service.
		Service service = Service.create(url, qname);
		// Extract the endpoint interface, the service "port".
		TimeServer timeServerObj = service.getPort(TimeServer.class);
		System.out.println(timeServerObj.getTimeAsString());
		System.out.println(timeServerObj.getServerName("Medha"));
		System.out.println(timeServerObj.getCompanyName());
		System.out.println("Credit score checking: "+ timeServerObj.checkCreditScore("Harry", 650));
	}
}