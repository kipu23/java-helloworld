package com.krisz.helloworld;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

public class Helloworld {

    public static void main(String[] args) throws IOException {

        System.out.println("Hello World!");

		Enumeration<URL> resources = Helloworld.class.getClassLoader().getResources("META-INF/MANIFEST.MF");
		while (resources.hasMoreElements()) {
			try {
				Manifest manifest = new Manifest(resources.nextElement().openStream());
				Attributes attr = manifest.getMainAttributes();
				System.out.println(attr.getValue("Git-SHA"));
			} catch (IOException E) {
				// handle
			}
		}

    }
}
