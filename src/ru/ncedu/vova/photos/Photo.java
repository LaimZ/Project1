package ru.ncedu.vova.photos;

import java.util.Arrays;


public class Photo {
    private String name;
    private long id;
    private long albumId;
    private long authorId;
    private String description;
    private String tags;
    private byte[] data;

    public Photo() {}
    
    public Photo(String name,
            long id,
            long albumId,
            long authorId,
            String description,
            String tags,
            byte[] data) {
        this.name = name;
        this.id = id;
        this.albumId = albumId;
        this.authorId = authorId;
        this.description = description;
        this.tags = tags;
        this.data = Arrays.copyOf(data, data.length);
    }
    
    public String getName() {
        return this.name;
    }

    public long getId() {
        return this.id;
    }

    public long getAlbumId() {
        return this.albumId;
    }

    public long getAuthorId() {
        return this.authorId;
    }

    public String getDescription() {
        return this.description;
    }

    public String getTags() {
        return this.tags;
    }
    
    
    
}
