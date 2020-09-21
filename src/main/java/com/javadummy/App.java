package com.javadummy;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger Log = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	String msg = "Hello World";
    	Log.debug(msg+" will be printed on debug");
    	Log.info(msg+" will be printed on info");
    	Log.warn(msg+" will be printed on warn");
    	Log.error(msg+" will be printed on error");
    	Log.fatal(msg+" will be printed on fatal");
    	Log.info("appending string: {}.",msg);
        System.out.println( msg );
    }
}
