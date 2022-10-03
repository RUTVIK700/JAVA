/*
 * Creation : 3 Oct 2022
 */
package com.buisness;

import java.util.ArrayList;
import java.util.List;

import com.dataApi.ToDoService;

public class ToDoServiceImp {
    private ToDoService todo;

    public ToDoServiceImp(ToDoService todo) {
        this.todo = todo;
    }

    public List<String> relatedtoString(String user) {
        List<String> filteredtodo = new ArrayList<String>();
        List<String> alltodos = todo.reterivereords(user);
        for (String t : alltodos) {
            if (t.contains("Spring")) {
                filteredtodo.add(t);
            }
        }
        return filteredtodo;
    }
}
