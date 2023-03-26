package tulla.club.amberweb.dao;

import tulla.club.amberweb.dao.IsContent;

public abstract class Content<T extends IsContent> {
    private String header;
    private String description;  // z.B. für das Hovern
    private T content; // z.B. String mit HTML
}
