package com.epam.Collection;
import org.apache.logging.log4j.*;


public class App 
{ 
	private static final  Logger LOGGER =  LogManager.getLogger(App.class);

    public static void main( String[] args )
    {   
    	
    	
        DataList<Integer> list = new DataList<>();
        DataList<String> list1 = new DataList<>();
        
        //Add elements to list
        list.add(1);
        list.add(2);
        list.add(3);
       LOGGER.info(list);
         
        //Remove elements from index
        list.remove(2);
       LOGGER.info(list);
         
        //Get element with index
       LOGGER.info( list.get(0) );
       LOGGER.info( list.get(1) );
 
        //List Size
       LOGGER.info(list.size());
        
        System.out.println("..................................................."); 
        
        //Add elements to list1
        list1.add("vaishali");
        list1.add("Govind");
        list1.add("C V Raman College");
        LOGGER.info(list1);
        
        //remove elements from index
        list1.remove(1);
        LOGGER.info(list1);
        
        //get elements with index
        LOGGER.info(list1.get(0));
        LOGGER.info(list1.get(1));
        
        //list size
        LOGGER.info(list.size());
    }
}
