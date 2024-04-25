package org.bsbo.domain;

import org.bsbo.Abstract.AbstractEntity;

public class Role extends AbstractEntity {

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String name;
}
