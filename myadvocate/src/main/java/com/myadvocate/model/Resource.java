package com.myadvocate.model;

/**
 * Created by rahul.sachan on 15/12/15.
 */
import java.io.Serializable;

/**
 * <p>
 * .
 * </p>
 *
 * @author sagyf yang
 * @version 1.0 2014-02-08 22:41
 * @since JDK 1.6
 */
public class Resource implements Serializable{
    private long id;
    private String name;
    private String last_name;
    private String e_position;


    public Resource(){
    }
    public Resource(long id, String name, String lname, String pos) {
        this.id = id;
        this.name = name;
        this.e_position = pos;
        this.last_name = lname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getE_position() {
        return e_position;
    }

    public void setE_position(String e_position) {
        this.e_position = e_position;
    }
}
