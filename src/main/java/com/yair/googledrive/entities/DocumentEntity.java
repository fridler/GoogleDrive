package com.yair.googledrive.entities;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "Document")
public class DocumentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Column(name = "TITLE",unique = true,nullable = false)
    private String title;

    @Column(name = "TEXT_CONTENT")
    private String textContent;

    @Column(name = "Create_Date_Time", updatable = false)
    @CreationTimestamp
    private LocalDateTime createDateTime;

    @Column(name = "Update_Date_Time")
    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    public DocumentEntity() {
    }

    public DocumentEntity(long id, String title, String textContent, LocalDateTime createDateTime, LocalDateTime updateDateTime) {
        this.id = id;
        this.title = title;
        this.textContent = textContent;
        this.createDateTime = createDateTime;
        this.updateDateTime = updateDateTime;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    public LocalDateTime getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(LocalDateTime updateDateTime) {
        this.updateDateTime = updateDateTime;
    }
}
