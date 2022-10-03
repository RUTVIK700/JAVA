/*
 * Creation : 3 Oct 2022
 */
package com.testing;

import java.util.Arrays;
import java.util.List;

import com.dataApi.ToDoService;

public class ToDoStub implements ToDoService {

    public List<String> reterivereords(String user) {
        return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
    }

}
