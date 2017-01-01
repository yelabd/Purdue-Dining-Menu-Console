package com.youssefelabd.json;

/**
 * Created by youssefelabd on 12/7/16.
 */
public class Requests
{
    private String headers;

    private String[] pathVariables;

    private String dataMode;

    private String preRequestScript;

    private String collectionId;

    private String[] data;

    private String[] responses;

    private String url;

    private String version;

    private String id;

    private String currentHelper;

    private String time;

    private String tests;

    private String description;

    private String name;

    private String method;

    private String[] helperAttributes;

    public String getHeaders ()
    {
        return headers;
    }

    public void setHeaders (String headers)
    {
        this.headers = headers;
    }

    public String[] getPathVariables ()
    {
        return pathVariables;
    }

    public void setPathVariables (String[] pathVariables)
    {
        this.pathVariables = pathVariables;
    }

    public String getDataMode ()
    {
        return dataMode;
    }

    public void setDataMode (String dataMode)
    {
        this.dataMode = dataMode;
    }

    public String getPreRequestScript ()
    {
        return preRequestScript;
    }

    public void setPreRequestScript (String preRequestScript)
    {
        this.preRequestScript = preRequestScript;
    }

    public String getCollectionId ()
    {
        return collectionId;
    }

    public void setCollectionId (String collectionId)
    {
        this.collectionId = collectionId;
    }

    public String[] getData ()
    {
        return data;
    }

    public void setData (String[] data)
    {
        this.data = data;
    }

    public String[] getResponses ()
    {
        return responses;
    }

    public void setResponses (String[] responses)
    {
        this.responses = responses;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getVersion ()
    {
        return version;
    }

    public void setVersion (String version)
    {
        this.version = version;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getCurrentHelper ()
    {
        return currentHelper;
    }

    public void setCurrentHelper (String currentHelper)
    {
        this.currentHelper = currentHelper;
    }

    public String getTime ()
    {
        return time;
    }

    public void setTime (String time)
    {
        this.time = time;
    }

    public String getTests ()
    {
        return tests;
    }

    public void setTests (String tests)
    {
        this.tests = tests;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getMethod ()
    {
        return method;
    }

    public void setMethod (String method)
    {
        this.method = method;
    }

    public String[] getHelperAttributes ()
    {
        return helperAttributes;
    }

    public void setHelperAttributes (String[] helperAttributes)
    {
        this.helperAttributes = helperAttributes;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [headers = "+headers+", pathVariables = "+pathVariables+", dataMode = "+dataMode+", preRequestScript = "+preRequestScript+", collectionId = "+collectionId+", data = "+data+", responses = "+responses+", url = "+url+", version = "+version+", id = "+id+", currentHelper = "+currentHelper+", time = "+time+", tests = "+tests+", description = "+description+", name = "+name+", method = "+method+", helperAttributes = "+helperAttributes+"]";
    }
}
