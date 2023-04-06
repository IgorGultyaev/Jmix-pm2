package com.company.jmixpm2.entity.projecttask;

import io.jmix.ui.screen.*;
import com.company.jmixpm2.entity.ProjectTask;

@UiController("ProjectTask.browse")
@UiDescriptor("project-task-browse.xml")
@LookupComponent("projectTasksTable")
public class ProjectTaskBrowse extends StandardLookup<ProjectTask> {
}