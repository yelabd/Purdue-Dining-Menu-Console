package com.youssefelabd.json;

/**
 * Created by youssefelabd on 12/7/16.
 */
public class Folders
{
    private String id;

    private String collection_id;

    private String[] order;

    private String collectionId;

    private String description;

    private String name;

    private String owner;

    private String write;

    private String collection_name;

    private String collection;

    private String collection_owner;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getCollection_id ()
    {
        return collection_id;
    }

    public void setCollection_id (String collection_id)
    {
        this.collection_id = collection_id;
    }

    public String[] getOrder ()
    {
        return order;
    }

    public void setOrder (String[] order)
    {
        this.order = order;
    }

    public String getCollectionId ()
    {
        return collectionId;
    }

    public void setCollectionId (String collectionId)
    {
        this.collectionId = collectionId;
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

    public String getOwner ()
    {
        return owner;
    }

    public void setOwner (String owner)
    {
        this.owner = owner;
    }

    public String getWrite ()
    {
        return write;
    }

    public void setWrite (String write)
    {
        this.write = write;
    }

    public String getCollection_name ()
    {
        return collection_name;
    }

    public void setCollection_name (String collection_name)
    {
        this.collection_name = collection_name;
    }

    public String getCollection ()
    {
        return collection;
    }

    public void setCollection (String collection)
    {
        this.collection = collection;
    }

    public String getCollection_owner ()
    {
        return collection_owner;
    }

    public void setCollection_owner (String collection_owner)
    {
        this.collection_owner = collection_owner;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", collection_id = "+collection_id+", order = "+order+", collectionId = "+collectionId+", description = "+description+", name = "+name+", owner = "+owner+", write = "+write+", collection_name = "+collection_name+", collection = "+collection+", collection_owner = "+collection_owner+"]";
    }
}
