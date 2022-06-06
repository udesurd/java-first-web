package com.udesurd.web.test.app.Models;

import javax.persistence.*;

@Entity
@Table (schema = "wall")
public class WallModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String test;
    private String tag;

    public WallModel() {

    }

    public WallModel(Long id, String test, String tag) {
        this.id = id;
        this.test = test;
        this.tag = tag;
    }

    public Long getId() {
        return this.id;
    }

    public String getTest() {
        return this.test;
    }

    public String getTag() {
        return this.tag;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WallModel)) return false;
        final WallModel other = (WallModel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$test = this.getTest();
        final Object other$test = other.getTest();
        if (this$test == null ? other$test != null : !this$test.equals(other$test)) return false;
        final Object this$tag = this.getTag();
        final Object other$tag = other.getTag();
        if (this$tag == null ? other$tag != null : !this$tag.equals(other$tag)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WallModel;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $test = this.getTest();
        result = result * PRIME + ($test == null ? 43 : $test.hashCode());
        final Object $tag = this.getTag();
        result = result * PRIME + ($tag == null ? 43 : $tag.hashCode());
        return result;
    }

    public String toString() {
        return "WallModel(id=" + this.getId() + ", test=" + this.getTest() + ", tag=" + this.getTag() + ")";
    }
}
