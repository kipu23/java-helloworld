package com.krisz.helloworld;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

public class HelloWorld {

    public static void main(String[] args) throws IOException {

        System.out.println("Hello World!");

        try {
			Enumeration<URL> resources = HelloWorld.class.getClassLoader().getResources("META-INF/MANIFEST.MF");
			while (resources.hasMoreElements()) {
				Manifest manifest = new Manifest(resources.nextElement().openStream());
				Attributes attr = manifest.getMainAttributes();
				String shaNumber = attr.getValue("Git-SHA");
				System.out.println("Git SHA number: " +  shaNumber);
			}
		} catch (IOException E) {
        	System.err.println("Error: Manifest file not found!");
		}

    }
}
