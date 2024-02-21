package HomeTask3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Stream implements Iterable<StudentGroup> {
    private int streamNamber;
    private List<StudentGroup> groupList;

    public int getStreamNamber() {
        return streamNamber;
    }

    public void setStreamNamber(int streamNamber) {
        this.streamNamber = streamNamber;
    }


    private int counter;

    public Stream(int streamNamber, List<StudentGroup> groupList) {
        this.streamNamber = streamNamber;
        this.groupList =  new ArrayList<StudentGroup>();;
    }

    public List<StudentGroup> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<StudentGroup> groupList) {
        this.groupList = groupList;
    }

    public void addStudyGroup(StudentGroup group) {
        groupList.add(group);

    }




    @Override
    public String toString() {
        return "Stream №" + streamNamber + ":" +groupList ;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return null;
    }
}