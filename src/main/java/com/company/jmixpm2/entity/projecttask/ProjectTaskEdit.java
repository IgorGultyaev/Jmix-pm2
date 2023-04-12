package com.company.jmixpm2.entity.projecttask;

import com.company.jmixpm2.app.TaskService;
import io.jmix.ui.screen.*;
import com.company.jmixpm2.entity.ProjectTask;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("ProjectTask.edit")
@UiDescriptor("project-task-edit.xml")
@EditedEntityContainer("projectTaskDc")
public class ProjectTaskEdit extends StandardEditor<ProjectTask> {
    @Autowired
    private TaskService taskService;

    @Subscribe
    public void onInitEntity(InitEntityEvent<ProjectTask> event) {
         event.getEntity().setAssignee(taskService.findLastBusyUser());
    }
}