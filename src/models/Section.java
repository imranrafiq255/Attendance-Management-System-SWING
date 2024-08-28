
package models;

public class Section {
    private String sectionName;
    private int room;

    public Section() {
        this("", 0);
    }

    public Section(String sectionName, int room) {
        this.sectionName = sectionName;
        this.room = room;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }


    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
    
}
