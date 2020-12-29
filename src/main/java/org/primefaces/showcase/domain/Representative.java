package org.primefaces.showcase.domain;

import java.io.Serializable;
import java.util.Objects;

public class Representative implements Serializable {
	
	private static final long serialVersionUID = 1L;

    public String name;
    public String image;

    public Representative() {}

    public Representative(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Representative that = (Representative) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, image);
    }

    @Override
    public String toString() {
        return name;
    }
}
