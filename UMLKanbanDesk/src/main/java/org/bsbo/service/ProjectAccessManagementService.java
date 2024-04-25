package org.bsbo.service;

import org.bsbo.domain.Project;
import org.bsbo.domain.User;

public interface ProjectAccessManagementService {
    boolean isProjectWorker(User user, Project project);
}
