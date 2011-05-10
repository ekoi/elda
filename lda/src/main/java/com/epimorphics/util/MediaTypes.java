package com.epimorphics.util;

import java.util.HashMap;

public class MediaTypes 
	{
    public static HashMap<String, MediaType> createMediaExtensions()
        {
        HashMap<String, MediaType> result = new HashMap<String, MediaType>();
        result.put( "xml", MediaType.TEXT_XML_TYPE );
        result.put( "html", MediaType.TEXT_HTML_TYPE );
        result.put( "text", MediaType.TEXT_PLAIN_TYPE );
        result.put( "json", MediaType.APPLICATION_JSON_TYPE );
        result.put( "ttl", MediaType.TEXT_TURTLE_TYPE );
        result.put( "owl", MediaType.RDF_XML_TYPE );
        result.put( "rdf", MediaType.RDF_XML_TYPE ); 
        return result;
        }  
    
    public static HashMap<String, String> createNewLanguageExtensions()
	    {
	    HashMap<String, String> result = new HashMap<String, String>();
	    result.put( "en", "en-uk" );
	    return result;
	    }
	}
