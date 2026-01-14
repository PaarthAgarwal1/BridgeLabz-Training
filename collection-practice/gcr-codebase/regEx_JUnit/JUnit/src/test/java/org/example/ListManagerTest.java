package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;
import java.util.List;

class ListManagerTest {
    private ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    void setUp(){
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    void testAddElement(){
        listManager.addElement(list,10);
        assertTrue(list.contains(10));
        assertEquals(1,list.size());
    }

    @Test
    void testRemoveElement(){
        list.add(10);
        list.add(20);
        listManager.removeElement(list,10);
        assertFalse(list.contains(10));
        assertEquals(1,list.size());
    }

    @Test
    void testGetSize(){
        list.add(1);
        list.add(2);
        list.add(3);
        int size = listManager.getSize(list);
        assertEquals(3,size);
    }
}
