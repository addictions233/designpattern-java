package com.one.note;

import com.one.note.INote;

/**
 * @author one
 * @description TODO
 * @date 2024-10-29
 */
public class JavaNote implements INote {
    @Override
    public void edit() {
        System.out.println("java note");
    }
}
