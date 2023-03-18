package tulla.club.amberweb.view.fields;

import tulla.club.amberweb.model.content.IsContent;

public abstract class Content<T extends IsContent> {
    private String header;
    private String description;  // z.B. für das Hovern
    private T content; // z.B. String mit HTML
}
