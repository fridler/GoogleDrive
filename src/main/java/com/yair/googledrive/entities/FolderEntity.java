package com.yair.googledrive.entities;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "Folder")
public class FolderEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME", nullable = false, unique = true)
    private String name = "new Folder";

    @Column(name = "LOCATION",nullable = false)
    private String location;

    @Column(name = "CONTAINS",length = 9999)
    private long contains = 0;

    @Column( name = "CREATED", updatable = false)
    @CreationTimestamp
    private LocalDateTime created;


    public FolderEntity(long id, String name, String location, long contains, LocalDateTime created) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.contains = contains;
        this.created = created;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getContains() {
        return contains;
    }

    public void setContains(long contains) {
        this.contains = contains;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
