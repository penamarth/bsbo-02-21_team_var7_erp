package org.bsbo.domain;

import org.bsbo.Abstract.AbstractEntity;

public class Task extends AbstractEntity {
    private TaskStatus taskStatus;
    private String description;
    private User completedBy;
}
