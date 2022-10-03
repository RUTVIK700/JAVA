/*
 * Creation : 3 Oct 2022
 */
package com.testing;

import java.util.List;

import org.junit.Test;

import com.buisness.ToDoServiceImp;

public class ToDoIMPLStub {

    @Test
    public void retrivedTODO() {
        ToDoStub t = new ToDoStub();
        ToDoServiceImp g = new ToDoServiceImp(t);
        List<String> k = g.relatedtoString("Rutvik");
        for (int i = 0; i < k.size(); i++) {
            if (k.get(i) == "") {

            }
        }

        /* assertEquals(2, k.size()); */
    }

}
