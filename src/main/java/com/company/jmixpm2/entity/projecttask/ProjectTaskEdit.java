package com.company.jmixpm2.entity.projecttask;

import io.jmix.ui.screen.*;
import com.company.jmixpm2.entity.ProjectTask;

@UiController("ProjectTask.edit")
@UiDescriptor("project-task-edit.xml")
@EditedEntityContainer("projectTaskDc")
public class ProjectTaskEdit extends StandardEditor<ProjectTask> {
}