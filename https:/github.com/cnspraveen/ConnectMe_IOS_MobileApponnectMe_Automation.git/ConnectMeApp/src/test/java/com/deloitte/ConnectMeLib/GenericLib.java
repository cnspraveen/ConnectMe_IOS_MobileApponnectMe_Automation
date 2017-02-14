package com.deloitte.ConnectMeLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import org.w3c.dom.events.EventException;

public class GenericLib
{
public static String readConfigPropFile(String PropFileName, String Key)
  {
	  String KeyValue = null;
	  try{
	  Properties prop = new Properties();
	  FileInputStream fis = new FileInputStream(PropFileName);
	  prop.load(fis);
	  KeyValue = prop.getProperty(Key);}  
	  catch(Exception e){e.printStackTrace();}
	  return KeyValue;
  }	  
}
