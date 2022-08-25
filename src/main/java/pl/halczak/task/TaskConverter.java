package pl.halczak.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class TaskConverter implements Converter<String, Task> {

    @Autowired
    private TaskService taskService;

   @Override
   public Task convert(String s){ return taskService.getTaskById(Long.parseLong(s));}

}
