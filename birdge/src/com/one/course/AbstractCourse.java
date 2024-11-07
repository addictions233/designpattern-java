package com.one.course;

/**
 * @author one
 * @description 使用抽象类作为桥接: 抽象桥接类遵循了组合复用原则
 * @date 2024-10-29
 */
public abstract class AbstractCourse implements ICourse{

    /**
     * 以持有对象的方式来复用功能
     */
    private IVideo video;

    private INote note;

    public IVideo getVideo() {
        return video;
    }

    public void setVideo(IVideo video) {
        this.video = video;
    }

    public INote getNote() {
        return note;
    }

    public void setNote(INote note) {
        this.note = note;
    }
}
